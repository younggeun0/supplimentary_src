package login.controller;

import static javax.swing.JOptionPane.showMessageDialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import login.dao.LoginDAO;
import login.view.LoginView;
import login.view.SearchAddressView;
import login.view.SignUpView;
import login.vo.UserInfoVO;

public class SignUpController extends WindowAdapter implements ActionListener,ItemListener {
	private LoginView lv;
	private SignUpView suv;
	private LoginDAO l_dao;
	private boolean flagId,flagPw,flagEmail,flagSsn;
	
	public SignUpController(LoginView lv, SignUpView suv) {
		this.lv = lv;
		this.suv = suv;
	}
	
	public void insertInfo() {
		if(!flagId) {
			JOptionPane.showMessageDialog(suv, "���̵� �ߺ�Ȯ���� ���ּ���.");
			return;
		}

		if((new String(suv.getJpfPw1().getPassword())==null)||
				((new String(suv.getJpfPw1().getPassword()).equals("")))) {
			JOptionPane.showMessageDialog(suv, "��й�ȣ�� �Է��ϼ���.");
			return;
		}
		if((new String(suv.getJpfPw2().getPassword())==null)||
				((new String(suv.getJpfPw2().getPassword()).equals("")))) {
			JOptionPane.showMessageDialog(suv, "��й�ȣ�� Ȯ���ϼ���.");
			return;
		}
		if((suv.getJtfName().getText().trim()==null)||
				(suv.getJtfName().getText().trim().equals(""))){
			JOptionPane.showMessageDialog(suv, "�̸��� �Է��ϼ���.");
			return;
		}
		
		if((suv.getJtfTel1().getText().trim()==null)||
				((suv.getJtfTel1().getText().trim().equals("")))||
				(suv.getJtfTel2().getText().trim()==null)||
				((suv.getJtfTel2().getText().trim().equals("")))||
				(suv.getJtfTel3().getText().trim()==null)||
				((suv.getJtfTel3().getText().trim().equals("")))) {
			JOptionPane.showMessageDialog(suv, "�ڵ��� ��ȣ�� �Է��ϼ���.");
			return;
		}else {
			if (suv.getJtfTel1().getText().length()!=3 || 
					!(suv.getJtfTel2().getText().length() > 2 && suv.getJtfTel2().getText().length() < 5)
					|| suv.getJtfTel3().getText().length() != 4) {
				showMessageDialog(suv, "��ȭ��ȣ�� �ڸ����� �߸��Ǿ����ϴ�.");
				return;
			}
			try {
				Integer.parseInt((suv.getJtfTel1().getText().trim()));
				Integer.parseInt((suv.getJtfTel2().getText().trim()));
				Integer.parseInt((suv.getJtfTel3().getText().trim()));
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(suv, "�ڵ��� ��ȣ�� ������������ �ԷµǾ�� �մϴ�.");
				return;
			}
		}
		
		if(
				((suv.getJtfEmail1().getText()==null)||
				(suv.getJtfEmail1().getText().equals("")))||
				((suv.getJtfEmail2().getText()==null)||
				(suv.getJtfEmail2().getText().equals("")))
			) {
			JOptionPane.showMessageDialog(suv, "�̸����� �Է��ϼ���.");
			return;
		}
		if((suv.getJtfAddress().getText().trim()==null)||
				((suv.getJtfAddress().getText().trim().equals("")))||
				(suv.getJtfAddrBunji().getText().trim()==null)||
				((suv.getJtfAddrBunji().getText().trim().equals("")))||
				(suv.getJtfAddMore().getText().trim()==null)||
				((suv.getJtfAddMore().getText().trim().equals("")))) {
			JOptionPane.showMessageDialog(suv, "�ּҸ� �Է��ϼ���.");
			return;
		}
		if(suv.getJcbQus().getSelectedIndex()==0){
			JOptionPane.showMessageDialog(suv, "������ �����ϼ���.");
			return;
		}
		if((suv.getJtfAddress().getText().trim()==null)||
				(suv.getJtfAddress().getText().trim().equals(""))){
			JOptionPane.showMessageDialog(suv, "�亯�� �����ϼ���.");
			return;
		}
		
		
		verifyPw();
		verifyEmail();
		
		if(!flagPw) {
			JOptionPane.showMessageDialog(suv, "��й�ȣ�� �´��� Ȯ���ϼ���.");
			return;
		}
		if(!flagEmail) {
			JOptionPane.showMessageDialog(suv, "�̸��� ������ ���� �ʽ��ϴ�.");
			return;
		}
		if(!flagSsn) {
			JOptionPane.showMessageDialog(suv, "�ֹι�ȣ ������ ���ּ���.");
			return;
		}
		
		
		System.out.println("idflag ="+flagId);
		System.out.println("pwflag ="+flagId);
		System.out.println("eamileflag ="+flagId);
		System.out.println("ssnflag ="+flagId);
		
		System.out.println("All"+ (flagId&&flagPw&&flagEmail&&flagSsn));
		if(flagId&&flagPw&&flagEmail&&flagSsn) {
			UserInfoVO uivo = new UserInfoVO(
					suv.getJtfId().getText().trim().toLowerCase(),
					suv.getJtfName().getText().trim().toLowerCase(), 
					new String(suv.getJpfPw2().getPassword()), 
					suv.getJtfTel1().getText().trim()+"-"+suv.getJtfTel2().getText().trim()
						+"-"+suv.getJtfTel3().getText().trim(), 
					suv.getJtfEmail1().getText().trim()+"@"+ suv.getJtfEmail2().getText().trim(),
					suv.getJtfAddress().getText()+" "+ suv.getJtfAddrBunji().getText()+" "+suv.getJtfAddMore().getText().trim(),
					suv.getJtfSsn1().getText()+"-"+suv.getJtfSsn2().getText(),
					String.valueOf(suv.getJcbQus().getSelectedIndex()),
					suv.getJtfAns().getText().trim()
					);
			try {
//				System.out.println(uivo);
				LoginDAO.getInstance().insertUserInfo(uivo);
				JOptionPane.showMessageDialog(suv, "�����մϴ�! \n ȸ�������� �Ϸ�Ǿ����ϴ�.");
				suv.getJtfId().setText("");
				suv.getJtfName().setText("");
				suv.getJpfPw1().setText(""); 
				suv.getJpfPw2().setText(""); 
				suv.getJtfTel1().setText("");
				suv.getJtfTel2().setText("");
				suv.getJtfTel3().setText("");
				suv.getJtfEmail1().setText("");
				suv.getJtfEmail2().setText("");
				suv.getJtfAddress().setText(""); 
				suv.getJtfAddrBunji().setText("");;
				suv.getJtfAddMore().setText("");
				suv.getJtfSsn1().setText("");
				suv.getJtfSsn2().setText("");
				suv.getJcbQus().setSelectedIndex(0);
				suv.getJtfAns().setText("");
				suv.getJcbEmail().setSelectedIndex(0);
				
			} catch (SQLException se) {
				se.printStackTrace();
			}
			
		}
	}
	public void verifyId() {
		try {
			if(!(suv.getJtfId().getText().trim()==null||suv.getJtfId().getText().trim().equals(""))) {
				if(l_dao.getInstance().searchId(suv.getJtfId().getText().trim())) {
					JOptionPane.showMessageDialog(suv, "��� ������ ���̵��Դϴ�.");
					flagId=true;
				}else {
					JOptionPane.showMessageDialog(suv, "�ߺ��� ���̵� �ֽ��ϴ� \n �ٽ��Է����ּ���.");
					suv.getJtfId().requestFocus();
					flagId = false;
					return;
				}
			}else {
				JOptionPane.showMessageDialog(suv, "���̵� �Է��ϼ���.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void verifyPw() { //��й�ȣ �˻�
		if(!new String(suv.getJpfPw1().getPassword()).equals(new String(suv.getJpfPw2().getPassword()))) {
			flagPw=false;
			return;
		}
		flagPw=true;
	}
	
	
	public void verifySsn() { //�ֹι�ȣ �˻�
		
		try {
		if((suv.getJtfSsn1().getText().trim()==null)||
				((suv.getJtfSsn1().getText().trim().equals("")))||
				(suv.getJtfSsn2().getText().trim()==null)||
				((suv.getJtfSsn2().getText().trim().equals("")))) {
			JOptionPane.showMessageDialog(suv, "�ֹι�ȣ�� �Է��ϼ���.");
			return;
		}
		if((Integer.parseInt(suv.getJtfSsn1().getText().trim())<7)||(Integer.parseInt(suv.getJtfSsn2().getText().trim())<8)) {
			JOptionPane.showMessageDialog(suv, "�ֹι�ȣ ������ �߸��Ǿ����ϴ�.");
			
		}
		
		String ssn = suv.getJtfSsn1().getText().trim()+suv.getJtfSsn2().getText().trim();
		char[] cutSsn =new char[ssn.length()];
		int sum = 0;
		int valid = 0;
		
		
		for(int i=0;i<ssn.length()-1;i++) {
			cutSsn[i] = ssn.charAt(i);
			if(i<8) {
				sum += ((int)cutSsn[i]-48)*(i+2);
			}else {
				sum += ((int)cutSsn[i]-48)*(i-6);
			}
		}
		valid = (int)ssn.charAt(12)-48;
		
		int nahnhum=(11-(sum%11))%10;
		if(!(valid==nahnhum)) {
			flagSsn = false;
			return;
		}
		flagSsn = true;
		JOptionPane.showMessageDialog(suv, "������ Ȯ�εǾ����ϴ�!");
		
		
		}catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(suv, "�ֹι�ȣ ������ �߸��Ǿ����ϴ�.");
		}
	
	}
	
	public void verifyEmail() {
		String[] dotcom = {"com","co.kr","net","kr","org","or.kr"};
		for(int i=0;i<dotcom.length;i++) {
			if(!(suv.getJtfEmail2().getText().substring(suv.getJtfEmail2().getText().indexOf(".")+1).equals(dotcom[i]))) {
				flagEmail = false;
			}else {
				break;
			}
		}
		if(suv.getJtfEmail2().getText().contains("@")||!suv.getJtfEmail2().getText().contains(".")||
				suv.getJtfEmail1().getText().contains("@")) {
			flagEmail = false;
			return;
		}
		flagEmail =true;
	}
	
	@Override
	public void windowClosing(WindowEvent we) {
		suv.dispose();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==suv.getJbAddress()) {
			new SearchAddressView(lv, suv); 
		}
		if(ae.getSource()==suv.getJbSignUp()) {
			insertInfo();
		}
		if(ae.getSource()==suv.getJbCancel()) {
			suv.dispose();
		}
		if(ae.getSource()==suv.getJbIdVerification()) {
			verifyId();
		}
		if(ae.getSource()==suv.getJbSsnVerification()) {
			verifySsn();
		}
			
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		if(ie.getItem()=="�����Է�") {
			suv.getJtfEmail2().setText("");
			suv.getJtfEmail2().setEditable(true);
			suv.getJtfEmail2().requestFocus();
		}
		if(ie.getItem()=="NAVER") {
			suv.getJtfEmail2().setText("naver.com");
			suv.getJtfEmail2().setEditable(false);
		}
		if(ie.getItem()=="GOOGLE") {
			suv.getJtfEmail2().setText("google.com");
			suv.getJtfEmail2().setEditable(false);
		}
		if(ie.getItem()=="DAUM") {
			suv.getJtfEmail2().setText("daum.net");
			suv.getJtfEmail2().setEditable(false);
		}
		
	}
	
	
}
