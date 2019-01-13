package example0112;


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


/**
 * **��ȣ���� ������ �Է¹޾� �ζǹ�ȣ�� �����ؼ� â�� ����ִ� ���α׷�<br>
 * 
 *-JDBC����) Ȯ���ϰ� ���� ȸ�� ���� CTL,CSV������ �����ؼ� ���� �ζǹ�ȣ ��÷��ȣ�� �����<br>
 *
 *1.�������̽��� �߻�Ŭ������ �並 �����<br>
 *2.��ü���������� �̺�Ʈ�߻�/ó��<br>
 *3.super�� �Ἥ ������ȣ��(JFrame ���̾�α��̸�)<br>
 *4.this ������ ȣ���� �̿��ؼ� Joptionpane �޼��� ����<br>
 *5.�迭 �̿��ؼ� �����=> �迭�� �̿��ϱ� ���� ó���� �� call by value<br>
 *6.�迭�� �̿��� �� ���� => List �� call by reference�� �̿��� VOó�� //�̺�Ʈó�� => call by reference<br>
 *7.����� singleton�� �̿�<br>
 *8.�̺�Ʈ ������(Overriding ���) VO�� ������ Overload ���<br>
 *9.JDBC ���۽� resultSet���� getInt/getString �� Wrapper ���<br>
 *10. DB Table���� // CTL,CSV ���� ����( CTL���� X)
 * 
 * @author Kong
 *
 */
@SuppressWarnings("serial")
public class LottoView extends JFrame{
	
	private JTextField jtfSelectedNum;
	private JTextArea jtaRandomLottoNum;
	private JTextArea jtaSearchNum;
	private JButton jbtCreate;
	private JButton jbtCreateClear;
	private JButton jbtSearch;
	private JButton jbtSearchClear;
	private JScrollPane jspRan;
	private JScrollPane jspSearch;
	
	
	public LottoView() {
		super("Lotto��ȣ ������"); 
		JLabel jlbCreateNum = new JLabel("������ ��ȣ ����");
		JLabel jlbLastNum = new JLabel("���� 1�� ��÷ ���� ����");
		jtfSelectedNum = new JTextField();
		jtaRandomLottoNum = new JTextArea();
		jtaRandomLottoNum.setBorder(new TitledBorder("������ȣ"));
		jtaRandomLottoNum.setEditable(false);
		jspRan= new JScrollPane(jtaRandomLottoNum);
		
		jtaSearchNum = new JTextArea();
		jtaSearchNum.setBorder(new TitledBorder("���� ��÷ ��ȣ"));
		jtaSearchNum.setEditable(false);
		jspSearch= new JScrollPane(jtaSearchNum);
		
		jbtCreate = new JButton("����");
		jbtCreateClear = new JButton("�ʱ�ȭ");
		jbtSearch = new JButton("��ȸ");
		jbtSearchClear = new JButton("�ʱ�ȭ");
		
		
		JPanel panelNorth = new JPanel();
		JPanel panelCenter = new JPanel();
		JPanel panelSouth = new JPanel();
		JPanel panelLeft = new JPanel();
		JPanel panelRight = new JPanel();
		
		panelLeft.setLayout(null);
		jlbCreateNum.setBounds(0,5,100,30);
		panelLeft.add(jlbCreateNum);
		jtfSelectedNum.setBounds(100, 5, 60, 30);
		panelLeft.add(jtfSelectedNum);
		jbtCreate.setBounds(160,5,60,30);
		panelLeft.add(jbtCreate);
		
		panelRight.add(jlbLastNum);
		panelRight.add(jbtSearch);
		
		panelNorth.setLayout(new GridLayout(1, 2));
		panelNorth.add("Left",panelLeft);
		panelNorth.add("Right",panelRight);
		
		add("North",panelNorth);
		
		panelCenter.setLayout(new GridLayout(1, 2));
		panelCenter.add("Left",jspRan);		
		panelCenter.add("Right",jspSearch);
		add("Center",panelCenter);
		
		panelSouth.setLayout(new GridLayout(1, 2));
		panelSouth.add("Left",jbtCreateClear);
		panelSouth.add("Right",jbtSearchClear);
		add("South",panelSouth);
		
		//////�̺�Ʈ//////
		LottoEvt le= new LottoEvt(this);
		jtfSelectedNum.addActionListener(le);
		jbtCreate.addActionListener(le);
		jbtCreateClear.addActionListener(le);
		jbtSearch.addActionListener(le);
		jbtSearchClear.addActionListener(le);
		addWindowListener(le);
		
		setBounds(100,100,1000,600);
		setVisible(true);
		setResizable(false);
		
	}
	public JTextField getJtfSelectedNum() {
		return jtfSelectedNum;
	}
	public JTextArea getJtaRandomLottoNum() {
		return jtaRandomLottoNum;
	}
	public JTextArea getJtaSearchNum() {
		return jtaSearchNum;
	}
	public JButton getJbtCreate() {
		return jbtCreate;
	}
	public JButton getJbtCreateClear() {
		return jbtCreateClear;
	}
	public JButton getJbtSearch() {
		return jbtSearch;
	}
	public JButton getJbtSearchClear() {
		return jbtSearchClear;
	}
	public JScrollPane getJspRan() {
		return jspRan;
	}
	public JScrollPane getJspSearch() {
		return jspSearch;
	}
	public static void main(String[] args) {
		new LottoView(); 
	}
	
}//class
