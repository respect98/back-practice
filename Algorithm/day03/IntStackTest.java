package day03;

public class IntStackTest {

	public static void main(String[] args) {
		IntStack sk=new IntStack(5); //초기용량 5
		sk.push(10);
		sk.push(20);
		sk.push(30);
		sk.push(40);
		sk.push(50);
//		sk.push(60);
		System.out.println(sk.peek());
		sk.pop();
		System.out.println(sk.peek());
		System.out.println(sk.size()+"<-요소 갯수");
		sk.clear();
		System.out.println(sk.size()+"<-clear()이후 요소 갯수");
		System.out.println("sk is Empty?"+sk.isEmpty());
		System.out.println("sk isFull?"+sk.isFull());
		for(int i=1; i<6; i++) {
			sk.push(i*100);
		}
		System.out.println("sk isEmpty? "+sk.isEmpty());
		System.out.println("sk isFull? "+ sk.isFull());
		System.out.println(sk.peek());
		System.out.println(sk.indexOf(200));
		System.out.println(sk.indexOf(205));
		sk.pop(); //500
		sk.pop(); //400
		sk.printStack();
		System.out.println("sk.capacity(): "+sk.getCapacity());
		System.out.println("sk.size(): "+sk.size());
		
	}

}
