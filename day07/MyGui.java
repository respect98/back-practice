package day07;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;
//JFrame : window계열의 컨테이너 ==> 내부에 contentPane이라는 컨테이너가 별도로 있다.
//JButton을 JFrame에 붙일 예정	==> contentPane을 얻어와서 여기에 붙이자
import javax.swing.JTextField;

public class MyGui extends JFrame {
	JButton b1,b2,b3,b4; //null
	Icon icon1, icon2, icon3;
	Container cp;
	JTextField tf1;
	JTextArea ta1;
	JCheckBox c1,c2,c3; //java, html, css
	JRadioButton r1,r2;
	
	
	
	
	
	public MyGui() {
		super(":::MyGui v1.1:::");//super();
		cp=this.getContentPane();
		//내용물들(컴포넌트)을 붙일 수 있는 패널(panel)
		icon1=new ImageIcon("images/icon1.Jpg");
		icon2=new ImageIcon("images/icon2.Jpg");
		icon3=new ImageIcon("images/icon3.Jpg");
		
		b1=new JButton("Home");
		b2=new JButton(icon1);
		b3=new JButton("로그인", icon2);
		b4=new JButton("Help", icon3);
		
		b2.setBackground(Color.white);
//		b2.setOpaque(true);
		
		b3.setBackground(Color.blue);
		b3.setForeground(Color.white);
		b3.setHorizontalTextPosition(JButton.CENTER);
		b3.setVerticalTextPosition(JButton.BOTTOM);
		b3.setPressedIcon(icon3);
		
		//ContentPane에 디폴트레이아웃 => BorderLayout(동,서,남,북,중앙)
		//레이아웃 설정
		cp.setLayout(new FlowLayout());
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		cp.add(b4);
		
		//JTextField(int columns)
		tf1=new JTextField("네이버를 검색해봐~",40);
		cp.add(tf1);
		
		ta1=new JTextArea("안녕~",7,40);
		JScrollPane sp = new JScrollPane(ta1); //스크롤바 패널에 ta1을 붙인다
		cp.add(sp);
		
		
		c1=new JCheckBox("Java");
		c2=new JCheckBox("HTML", true);
		c3=new JCheckBox("CSS",icon3, true);
		
		cp.add(c1);
		cp.add(c2);
		cp.add(c3);
		
		r1=new JRadioButton("남자");
		r2=new JRadioButton("여자",true);
		cp.add(r1);
		cp.add(r2);
		//단일 선택이 되도록 하려면 ButtonGroup객체를 생성한 뒤, 이 객체에 라디오버튼을 추가한다.
		ButtonGroup group=new ButtonGroup();
		group.add(r1);
		group.add(r2);
		r1.setToolTipText("adfs");
		r2.setToolTipText("풍선도움말 입니다");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창닫기 처리 메서드
	}


	public static void main(String[] args) {
		MyGui my =new MyGui(); // JFrame은 사이즈 지정하고 setVisible(true)줘야 확인 가능
		my.setSize(500,500);//width, height
		my.setVisible(true);

	}

}
