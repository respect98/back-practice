package day09;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.*;

public class SubFrame extends JFrame {

	JTextField tfR, tfG, tfB;
	JButton btApply, btClose;
	Container cp;//Ctrl+Shif+O
	JPanel p =new JPanel();
	public SubFrame() {
		super("::SubFrame::");
		cp=this.getContentPane();
		cp.setLayout(new GridLayout(0,1,10,10)); //1열은 고정, 행은 가변적으로
		
		cp.add(tfR=new JTextField());
		cp.add(tfG=new JTextField());
		cp.add(tfB=new JTextField());
		cp.add(p);
		
		p.add(btApply=new JButton("Apply"));
		p.add(btClose=new JButton("Close"));
		
		tfR.setBorder(new TitledBorder("Red"));
		tfG.setBorder(new TitledBorder("Green"));
		tfB.setBorder(new TitledBorder("Blue"));
		
		this.setBackground(Color.white);
		
		setSize(200,300);
		
		
	}

}////////////////////////////
