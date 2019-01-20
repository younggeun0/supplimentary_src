package login.view;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import login.dao.LoginDAO;
import login.vo.UserInfoVO;

@SuppressWarnings("serial")
public class UserView extends JFrame implements Runnable{
	private DefaultTableModel dtmUser;
	private JTable jtUser;
	private LoginDAO l_dao;

	
	public UserView(LoginView lv) {
		super("������ ���̺�");
			
			String[] usetList= {"���̵�","�̸�","��й�ȣ","����ó","�̸���","�ֹι�ȣ","�ּ�","����Ÿ��","���� ��"};
			dtmUser = new DefaultTableModel(usetList, 0){
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
			jtUser = new JTable(dtmUser);
			jtUser.getTableHeader().setReorderingAllowed(false);
			jtUser.getTableHeader().setResizingAllowed(false);
			jtUser.setRowHeight(30);
			JScrollPane jsp = new JScrollPane(jtUser);
			
			
			add("Center",jsp);
			setBounds(lv.getX()+100,lv.getY()+100,800,300);
			setResizable(false);
			setVisible(true);
		}
	@Override
	public void run() {
		//thread �α����� üũ�ؼ� �α��� ������ vo�� dao���� �˻��ؼ� ������ ���� dtm�� ����
		while(true) {
			try {
				List<UserInfoVO> list = l_dao.getInstance().selectUserList();
				DefaultTableModel dtm = dtmUser;
				dtm.setRowCount(0);
				
				Object[] rowData = null;
				UserInfoVO uivo = null;
				System.out.println(list);
				for(int i=0;i<list.size();i++) {
					uivo = list.get(i);
					rowData = new Object[9];
					rowData[0] = uivo.getId();
					rowData[1] = uivo.getName();
					rowData[2] = uivo.getPassword();
					rowData[3] = uivo.getTel();
					rowData[4] = uivo.getEmail();
					rowData[5] = uivo.getSsn();
					rowData[6] = uivo.getAddress();
					rowData[7] = uivo.getQuestion();
					rowData[8] = uivo.getAnswer();
					
					//{"���̵�","��й�ȣ","�̸�","����ó","�̸���","�ֹι�ȣ","�ּ�","����Ÿ��","���� ��"};
					dtm.addRow(rowData);
				}
	//			
			} catch (SQLException se) {
				JOptionPane.showMessageDialog(this, "DB �����߻�....");
				se.printStackTrace();
			} catch( InterruptedException ie) {
				ie.printStackTrace();
			}
		}//while
	}
	

	
}
