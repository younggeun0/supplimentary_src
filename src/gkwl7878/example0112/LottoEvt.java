package example0112;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

public class LottoEvt extends WindowAdapter implements ActionListener {

	private LottoView lv;
	private LottoEvtDAO le_dao;

	public LottoEvt() {
		JOptionPane.showMessageDialog(lv, "Lotto번호 생성기 START!");
	}

	public LottoEvt(LottoView lv) {
		this();
		this.lv = lv;
		le_dao = LottoEvtDAO.getInstance();
		
	}

	@Override
	public void windowClosing(WindowEvent we) {
		lv.dispose();
	}

	@Override
	public void windowClosed(WindowEvent we) {
		System.exit(0);
	}

	public void createNum() {

		int selectedNum = 0;
		selectedNum = Integer.parseInt(lv.getJtfSelectedNum().getText().trim());
		Set<Integer> setRan = new HashSet<Integer>();
		Random r = new Random();

		StringBuilder ranNum = new StringBuilder();
		int cnt = 0;
		Integer[] arrayNum = new Integer[7];
		ranNum.append(selectedNum).append("개의 Lotto번호가 추출되었습니다.\n\n\n");
		for (int i = 0; i < selectedNum; i++) {
			boolean flag = true;
			while (flag) {
				setRan.add((Integer) r.nextInt(45) + 1);
				if (setRan.size() == 7) {
					flag = false;
				}
			}
			cnt++;
			ranNum.append(cnt).append("==> ");
			setRan.toArray(arrayNum);
			for (int k = 0; k < setRan.size(); k++) {
				ranNum.append(arrayNum[k]).append("  ");
			}
			ranNum.append("\n").append("--------------------------------------------------------------------------------\n");
			setRan.clear();
		}
//		System.out.println(ranNum.toString());	
		lv.getJtaRandomLottoNum().setText(ranNum.toString());
	}

	public void searchNum() {
		try {
			StringBuilder searchNumber = new StringBuilder();
			List<LottoVO> list = le_dao.selectLotto(); //반환값이 커서의 마지막수인 리스트의 사이즈이므로 for문의 범위지정에 사용?.
			
			LottoVO lvo =null;
			searchNumber.append("회차 ||  추첨일    |당첨자수|     액수          |     당첨번호\n\n\n");
			for(int i=0;i<list.size();i++) {
				lvo = list.get(i);
				searchNumber
				.append(lvo.getTimes()).append("회차 || ")
				.append(lvo.getDate()).append(" | ")
				.append(lvo.getWinnercount()).append(" | ")
				.append(lvo.getAmount()).append(" | ")
				.append(lvo.getNum1()).append(" ")
				.append(lvo.getNum2()).append(" ")
				.append(lvo.getNum3()).append(" ")
				.append(lvo.getNum4()).append(" ")
				.append(lvo.getNum5()).append(" ")
				.append(lvo.getNum6()).append(" ")
				.append(lvo.getNum7()).append("  | ")
				.append(" \n")
				.append("--------------------------------------------------------------------------------------------------\n");
				
			}
//			searchNumber.append(" \n")
//			.append("---------------------------------------------------\n");
			lv.getJtaSearchNum().setText(searchNumber.toString());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(lv, "데이터 가져오기에 실패하였습니다.");
			e.printStackTrace();
		}
		
	}

	public void clearRan() {
		lv.getJtfSelectedNum().setText("");
		lv.getJtfSelectedNum().requestFocus();
		lv.getJtaRandomLottoNum().setText("");
	}

	public void clearNum() {
		lv.getJtaSearchNum().setText("");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == lv.getJbtSearch()) {
			searchNum();
			
		}else if (ae.getSource() == lv.getJbtCreateClear()) {
			clearRan();
		}else if (ae.getSource() == lv.getJbtSearchClear()) {
			clearNum();
		}else if (lv.getJtfSelectedNum().getText() == null || lv.getJtfSelectedNum().getText().trim().equals("")) {
			JOptionPane.showMessageDialog(lv, "입력이 없습니다");
		} else {
			
			if (ae.getSource() == lv.getJbtCreate() || ae.getSource() == lv.getJtfSelectedNum()) {

				try {
					createNum();
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(lv, "숫자형식을 입력해주세요");

				}
			}
		}

	}

}
