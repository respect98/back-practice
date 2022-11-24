package day10;
/*스레드 구현 방법
 * [1] java.lang.Thread클래스를 상속
 * [2] java.lang.Runnable인터페이스를 상속
 * */

class SnailThread extends Thread {

	public SnailThread(String name) {
		this.setName(name);
	}// public------------

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println(this.getName() + "스레드가 기어갑니다");
			/*
			 try { 
				 Thread.sleep(100); 
				 // 1초간 잠을 잔다 
				 // 1/1000초 단위 
				 // =>Block상태가된다(Sleep()/IO작업시) 
			 } catch (InterruptedException e) {
				 e.printStackTrace(); 
				 break;
			}
			 */
		} // for----------------
	}//run-----------------
}//SnailThread----------

public class ThreadTest2 {

	public static void main(String[] args) {
		SnailThread tr1 = new SnailThread("똘똘이 달팽이");
		SnailThread tr2 = new SnailThread("홀쭉이 달팽이");
		SnailThread tr3 = new SnailThread("이쁜이 달팽이");
		//우선순위: 1(제일 낮음)~10(제일 높음)
		tr1.setPriority(Thread.MIN_PRIORITY);//1
		tr2.setPriority(Thread.NORM_PRIORITY);//5
		tr3.setPriority(Thread.MAX_PRIORITY);//10
		
		tr1.start();
		tr2.start();
		tr3.start();

		//tr2.interrupt();
		//Thread.yield();
		//우선순위가 같거나 높은 스레드에게만 양보함
		try {
		tr2.join();
		//tr2스레드가 작업을 다 마칠 때까지 tr2.join()호출한
		//스레드(여기서는 메인스레드)가 block상태가 된다
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hello World~~~~~~");

	}

}
