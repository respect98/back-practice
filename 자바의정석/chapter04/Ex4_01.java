package chapter04;
public class Ex4_01 {
	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x=%d 일 때, 참인것은%n",x); //x=0 일 때 참인것은
		
		if(x==0) System.out.println("x==0"); //O
		if(x!=0) System.out.println("x!=0"); //X
		if(!(x==0)) System.out.println("!(x==0)"); //X
		if(!(x!=0)) System.out.println("!(x!=0)"); //O
		
		x = 1;
		System.out.printf("x=%d일 때, 참인 것은%n", x); //x=1일 때 참인것은
		
		if(x==0) System.out.println("x==0"); //X
		if(x!=0) System.out.println("x!=0"); //O
		if(!(x==0)) System.out.println("!(x==0)"); //O
		if(!(x!=0)) System.out.println("!(x!=0)"); //X

	}

}
