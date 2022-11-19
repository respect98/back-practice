package day08;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class MyHomePanel extends JPanel {

	JButton btnHome;
	
	public MyHomePanel() {
		this.setLayout(null);
		
		btnHome = new JButton("To Login Page");
		
		
		btnHome.setBounds(90, 240, 200, 50);
		btnHome.setBackground(new Color(123,123,123));
		btnHome.setBorder(new LineBorder(Color.gray,3));
		
		this.add(btnHome);
	}
	
	
}
