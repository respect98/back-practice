package day10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPaint extends JFrame {

	Container cp;
	JPanel rootP = new JPanel();
	JPanel pN=new JPanel();
	JButton bt[]=new JButton[7];
	String label[]= {"Red","Green","Blue","Plus","Minus","Eraser","All Clear"};
	
	MyCanvas can=new MyCanvas();
	public MyPaint() {
		super("::MyPaint::");
		cp = this.getContentPane();
		//cp의 기본 레이아웃은 BorderLayout
		//(동,서,남,북,중앙) 영역을 지정해서 붙인다
		//디폴트는 중앙에 붙는다.
		cp.add(rootP, BorderLayout.CENTER);
		cp.add(pN,BorderLayout.NORTH);
		
		rootP.setBackground(Color.LIGHT_GRAY);
		can.setSize(500,400);
		can.setBackground(Color.white);
		rootP.add(can);
		
		//리스너 부착-------------
		MyMouseHandler handler=new MyMouseHandler(this);
		for(int i=0; i<bt.length; i++) {
			bt[i]=new JButton(label[i]);
			pN.add(bt[i]);
			bt[i].addActionListener(handler);
		}

		can.addMouseMotionListener(handler);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-------------------------

	public static void main(String[] args) {
		MyPaint my = new MyPaint();
		my.setBounds(1200, 100, 700, 500);
		//x, y, w, h
		my.setVisible(true);
	}//------------------------

}//class/////////////////////////////////////

