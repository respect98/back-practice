package day10;
import java.awt.event.*;
import java.awt.*;
/*
 * 이벤트 : MouseEvent
 * 이벤트핸들러: MouseListener
 * 
 * */
public class MyMouseHandler implements MouseMotionListener, ActionListener{
	MyPaint my;
	public MyMouseHandler(MyPaint my) {
		this.my=my;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if(o==my.bt[0]) {
			my.can.cr=Color.red;
		}else if(o==my.bt[1]) {
			my.can.cr=Color.green;
		}else if(o==my.bt[2]) {
			my.can.cr=Color.blue;
		}else if(o==my.bt[5]) {//부분 지우기
			my.can.cr=my.can.getBackground();
		}else if(o==my.bt[3]) {//plus
			my.can.w+=2;
		}else if(o==my.bt[4]) {//minus
			if(my.can.w>3) {
			my.can.w-=2;
			}
		}else if(o==my.bt[6]) {//all clear
			Graphics g=my.can.getGraphics();
			g.clearRect(0, 0, my.can.getWidth(), my.can.getHeight());
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
//		my.setTitle("Drag");
		//마우스를 드래그한 시점의 x,y좌표를 알아내서
		int x=e.getX();
		int y=e.getY();
		my.setTitle("x: "+x+", y: "+y);
		//MyCanvas의 x,y좌표를 알아내서
		my.can.x=x;
		my.can.y=y;
		
		//전달된 x,y좌표가 적용되려면 캔버스를 다시 그려야 한다
		my.can.repaint();
	}
	/*개발자					JVM
	 * can.repaint()===>	   	can.update() ===========> can.paint()
	 * 						   	기존의 그린 그림을		  그림 그리기
	 * 							모두 지우기를 한 뒤에
	 * 
	 * 전부지우기
	 * can==>Graphics를 얻어와서
	 * clearRect(0,0,w,h)
	 * 
	 * */
	@Override
	public void mouseMoved(MouseEvent e) {
//		my.setTitle("Move");
	}
	
}

