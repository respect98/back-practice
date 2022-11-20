package day09;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;
// 이벤트 핸들러를 외부로 작성하는 경우
/* -인자 생성자를 구성해서 같이 연동할 객체를 전달받는다
 * -멤버변수에 전달하고 
 * - 멤버변수로 핸들링한다
 * */

//MyGui3의 open을 누르면 SubFrame을 보여주기

public class GuiHandler implements ActionListener{
	MyGui3 mainF;
	public GuiHandler(MyGui3 mg) {
		this.mainF=mg;
	}
	
	
	public void clearTf() {
		mainF.sf.tfR.setText(null);
		mainF.sf.tfG.setText(null);
		mainF.sf.tfB.setText(null);
		mainF.sf.tfR.requestFocus();
	}
	
	public void showMsg(String msg) {
	JOptionPane.showMessageDialog(mainF, msg);
	}
	
	private void applyColor() {
		try {
		int r=Integer.parseInt(mainF.sf.tfR.getText());
		int g=Integer.parseInt(mainF.sf.tfG.getText());
		int b=Integer.parseInt(mainF.sf.tfB.getText());
		
		Color cr = new Color(r,g,b);
		mainF.can.setBackground(cr);
		}catch(NumberFormatException e) {
			showMsg( "RGB값은 0~255사이의 정수여야 해요");
			clearTf();
		}catch(IllegalArgumentException e) {
			showMsg( "RGB값은 0~255사이의 정수여야 해요");
			clearTf();
		}
		
	}//----------------------------
	
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o==mainF.btOpen) {
			mainF.sf.setLocation(mainF.getLocation().x+mainF.getSize().width, mainF.getLocation().y);
			mainF.sf.setVisible(true);
		}else if(o==mainF.btExit) {
			System.exit(0);
		}else if(o==mainF.sf.btApply) {
			applyColor();
		}else if(o==mainF.sf.btClose) {
			//System.exit(0);
			//mainF.sf.setVisible(false);
			mainF.sf.dispose();
		}
	}
	
}///////////////////////////////
