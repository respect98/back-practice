package day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*이벤트 소스: JButton
 * 이벤트	  : ActionEvent
 * 이벤트핸들러 : ActionListener
 * */

public class MyEngine extends JFrame implements ActionListener {// [2]

	Container cp;
	JPanel p;
	JButton[] bt;
	String str[] = { "Naver", "Google", "Daum", "Yahoo" };
	Color origin;

	public MyEngine() {
		super("::MyEngine::");
		cp = this.getContentPane();
		cp.add(p = new JPanel());
		p.setLayout(new GridLayout(2, 2, 10, 10));
		// 2행2열, 수평간격:10, 수직간격 10

		// 배열 4개 생성해서 배열 bt에 저장한 뒤 p에 부착
		// 버튼에 대한 이벤트 처리하기
		bt = new JButton[4];
		for (int i = 0; i < bt.length; i++) {
//			bt[i]=new JButton(str[i]);
//			p.add(bt[i]);
			p.add(bt[i] = new JButton(str[i]));
			bt[i].addActionListener(this);
		} // -------------------

		origin = bt[0].getBackground();
		System.out.println(origin);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// -------------------------------------

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		Color cr = ((JButton) o).getBackground();
		if (cr == origin) {
			if (o == bt[0]) {
				bt[0].setBackground(Color.green);
			} else if (o == bt[1]) {
				bt[1].setBackground(Color.orange);
			} else if (o == bt[2]) {
				bt[2].setBackground(Color.magenta);
			} else if (o == bt[3]) {
				bt[3].setBackground(Color.cyan);
			}
		}else {
			((JButton)o).setBackground(origin);
		}
	}// --------------------------------------

	// JFrame의 바깥 여백을 주는 메서드 재정의
	@Override
	public Insets getInsets() {
		Insets in = new Insets(40, 20, 20, 20);// top,left,bottom,right
		return in;
	}// ------------------------

	public static void main(String[] args) {
		MyEngine my = new MyEngine();
		my.setSize(500, 500);
		my.setVisible(true);

	}

}
