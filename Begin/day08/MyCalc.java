package day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCalc extends JFrame implements ActionListener {

	Container cp;
	JPanel p = new JPanel();
	JLabel lb1, lb2, lb3;
	JTextField tf1, tf2, tf3;
	JButton btPlus, btReset;

	public MyCalc() {
		super("::MYCalc::");
		cp = this.getContentPane();
		cp.add(p);
		p.setBackground(Color.white);

		p.setLayout(new GridLayout(4, 2, 10, 10));

		lb1 = new JLabel("정수 1: ", JLabel.CENTER);
		lb2 = new JLabel("정수 2: ", JLabel.CENTER);
		lb3 = new JLabel("결  과: ", JLabel.CENTER);

		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);

		btPlus = new JButton("Plus");
		btReset = new JButton("Reset");

		p.add(lb1);
		p.add(tf1);
		p.add(lb2);
		p.add(tf2);
		p.add(lb3);
		p.add(tf3);
		p.add(btPlus);
		p.add(btReset);

		this.setBackground(Color.white);

		tf3.setEditable(false);// 편집못하게<=결과만 보여주게

		btPlus.addActionListener(this);
		btReset.addActionListener(this);

		setSize(300, 300); // w.h
		setLocation(500, 200); // x,y
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// --------------------------------

	public void ClearTF() {
		tf1.setText(null);
		tf2.setText(null);
		tf3.setText(null);
		tf1.requestFocus();//입력포커스 추가
	}//------------------------------
	public void calc() {
		String num1 = tf1.getText();
		String num2 = tf2.getText();
		String rs = "";
		try {
			int result = Integer.parseInt(num1) + Integer.parseInt(num2);
			rs = Integer.toString(result);

			tf3.setText(rs);
		} catch (NumberFormatException w) {
			//tf3.setText("정수만 입력해 주세요");
			JOptionPane.showMessageDialog(p, "정수를 입력해야 해요");
			ClearTF();
		}
		
	}//------------------------
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o == btPlus) {
			calc();
		} else if (o == btReset) {
			ClearTF();
		}
	}// ----------------------------

	@Override
	public Insets getInsets() {
		return new Insets(40, 15, 15, 15);
	}

	public static void main(String[] args) {
		new MyCalc();

	}

}
