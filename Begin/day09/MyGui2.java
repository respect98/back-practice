package day09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//JButton, JTextField => ActionEvent
//JRadioButton => ItemEvent => ItemListener
/*이벤트핸들러 구성하는 방법
 * [1] 컴포넌트를 가진 클래스가 이벤트핸들러가 되는 방법
 * [2] 이너 클래스로 구성하는 방법
 * 		- 이너 멤버 클래스
 * 		- 이름없는 로컬 클래스
 * [3] 외부 클래스로 구성하는 방법*/

public class MyGui2 extends JFrame {

	Container cp;
	JPanel rootP = new JPanel() {
		@Override
		public Insets getInsets() {
			return new Insets(40,0,0,0);
		}
	};
	JRadioButton r,g,b;
	Canvas can;

	public MyGui2() {
		super("::MyGui2::");
		cp = this.getContentPane();
		cp.add(rootP);
		rootP.setBackground(Color.white);
		
		r=new JRadioButton("Red");
		g=new JRadioButton("Green", true);
		b=new JRadioButton("Blue");
		
		rootP.add(r);
		rootP.add(g);
		rootP.add(b);
		r.setBackground(Color.white);
		g.setBackground(Color.white);
		b.setBackground(Color.white);

		ButtonGroup group = new ButtonGroup();
		group.add(r); group.add(g); group.add(b);
		
		can= new Canvas(); //도화지 클래스 => 컴포넌트=> 사이즈 주고 배경색을 주어야 확인 가능
		rootP.add(can);
		can.setSize(200,200);
		can.setBackground(Color.green);
		//리스너 부착--------
		
		r.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				can.setBackground(Color.red);
			}
		});
		
		g.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				can.setBackground(Color.green);
			}
		});
		
		b.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				can.setBackground(Color.blue);
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-------------------------
	

	public static void main(String[] args) {
		MyGui2 my = new MyGui2();
		my.setBounds(1200, 100, 300, 400);
		//x, y, w, h
		my.setVisible(true);
	}//------------------------

}//class/////////////////////////////////////
