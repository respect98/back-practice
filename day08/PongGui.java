package day08;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PongGui extends JFrame implements ActionListener {

	Container cp;
	MyHomePanel p2;
	MyLoginPanel p1;
	CardLayout card;
	
	public PongGui() {
		cp=this.getContentPane();//default => BorderLayout
		cp.setLayout(card=new CardLayout());//카드레이아웃 설정
		p1=new MyLoginPanel();
		p2=new MyHomePanel();
		
		cp.add(p1, "login");
		cp.add(p2, "home");
		
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.pink);
		
		p1.btnLogin.addActionListener(this);
		
		
//		card.show(cp, "home");
		
		this.setSize(400,600);
		this.setLocation(1000, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}/////////////////////////////
	
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if(o==p1.btnLogin) {
			char ch=(p1.tfName.getText()).charAt(0);
			if(ch=='퐁') {
				JOptionPane.showMessageDialog(p1, "퐁씨는 환영입니다.");
				card.show(cp, "home");
			}else if(ch=='콩') {
				clearTf();
				try {
					throw new NotSupportedNameException("콩씨는 절대 안돼!!!");
				}catch(NotSupportedNameException a) {
					JOptionPane.showMessageDialog(p1, "콩씨는 절대 안돼!!!");
				}
			}else {
				card.show(cp, "home");
				try {
					throw new NotSupportedNameException("기타성씨분들은 이용에 제한이 있어요.");
				}catch(NotSupportedNameException a) {
					JOptionPane.showConfirmDialog(p1, "기타성씨분들은 이용에 제한이 있어요.");
				}
			}
		}
		else if(o==p2.btnHome) {
			clearTf();
			card.show(cp, "login");
		}
	}
	
	public void clearTf() {
		p1.tfName.setText(null);
		p1.tfpwd.setText(null);
		p1.tfName.requestFocus();
	}

	public static void main(String[] args) {
		new PongGui();

	}

}
