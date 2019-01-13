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
 * **번호생성 갯수를 입력받아 로또번호를 생성해서 창에 띄워주는 프로그램<br>
 * 
 *-JDBC연동) 확인하고 싶은 회차 선택 CTL,CSV파일을 연동해서 지난 로또번호 당첨번호를 띄워줌<br>
 *
 *1.인터페이스와 추상클래스로 뷰를 만들고<br>
 *2.객체다형성으로 이벤트발생/처리<br>
 *3.super를 써서 생성자호출(JFrame 다이얼로그이름)<br>
 *4.this 생성자 호출을 이용해서 Joptionpane 메세지 띄우기<br>
 *5.배열 이용해서 값사용=> 배열을 이용하기 위해 처리할 값 call by value<br>
 *6.배열을 이용한 값 저장 => List 와 call by reference를 이용한 VO처리 //이벤트처리 => call by reference<br>
 *7.상수는 singleton에 이용<br>
 *8.이벤트 다형성(Overriding 사용) VO에 생성자 Overload 사용<br>
 *9.JDBC 동작시 resultSet에서 getInt/getString 에 Wrapper 사용<br>
 *10. DB Table생성 // CTL,CSV 파일 생성( CTL파일 X)
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
		super("Lotto번호 생성기"); 
		JLabel jlbCreateNum = new JLabel("생성할 번호 갯수");
		JLabel jlbLastNum = new JLabel("역대 1등 당첨 정보 보기");
		jtfSelectedNum = new JTextField();
		jtaRandomLottoNum = new JTextArea();
		jtaRandomLottoNum.setBorder(new TitledBorder("랜덤번호"));
		jtaRandomLottoNum.setEditable(false);
		jspRan= new JScrollPane(jtaRandomLottoNum);
		
		jtaSearchNum = new JTextArea();
		jtaSearchNum.setBorder(new TitledBorder("역대 당첨 번호"));
		jtaSearchNum.setEditable(false);
		jspSearch= new JScrollPane(jtaSearchNum);
		
		jbtCreate = new JButton("생성");
		jbtCreateClear = new JButton("초기화");
		jbtSearch = new JButton("조회");
		jbtSearchClear = new JButton("초기화");
		
		
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
		
		//////이벤트//////
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
