package day07;

public abstract class Animal {
	abstract public void crySound();
	abstract public void getBaby(int n);
}

class Dog extends Animal{
	public void crySound() {
		System.out.println("멍멍~~~");
	}
		
	public void getBaby(int n) {
		System.out.println(n+"마리의 새끼를 낳았어요");
	}	
}

class Cat extends Animal{
	public void crySound() {
		System.out.println("야옹야옹~");
	}
		
	public void getBaby(int n) {
		System.out.println(n+"마리의 새끼를 낳았어요");
	}	
	
	
}

class Duck extends Animal{
	public void crySound() {
		System.out.println("꽥꽥~~");
	}
		
	public void getBaby(int n) {
		System.out.println(n+"개의 알을 낳았어요");
	}	
	
	
}
