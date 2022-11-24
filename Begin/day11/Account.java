package day11;

public class Account {
	
	private int money=10;
	private boolean flag = false;
	
	//synchronized를 붙이면 해당 객체의 lock을 쥐어야만 해당 블럭을 수행할 수 있음
	public void save(int val) {
		synchronized(this) {
		if(flag) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
			money+=val;
			System.out.printf("입금액: %d, 입금후 잔액: %d%n", val, money);
			flag=true;
			notify();
			//wait pool에 대기 중인 스레드 하나를 깨워서 runnable한 상태로
			//전환시킨다. notifyAll() => 대기 중인 스레드 모두를 깨움
		}// 동기화 블럭-------------------------
		
	}
	
	synchronized public void get(int val) {
		if(!flag) {
			try {
				wait();
				// wait()가 호출되면 스레드는 수행권한을 포기하고 wait pool에 가서 대기한다.
				// 이 때 락을 반납하고 대기상태에 들어간다.
			}catch(InterruptedException e) {}
			
		}//---------------------if
		
		
		if(money-val <0) {
			System.out.printf("현금 부족!! 현재 잔액: %d, 요청 금액: %d%n", money, val);
			flag= false;
			notify();
			return;
		}
		money-=val;
		System.out.printf("출금액: %d, 출금 후 잔액: %d%n", val, money);
		flag = false;
		notify();
	}
	
	
}///////////////////////////////////////
