package chapter02;

public class Ex2_04 {

	public static void main(String[] args) {
	byte b =1;
	short s =2;
	char c = 'A';
	
	int finger =10;
	long big = 100_000_000_000L; //long big = 100000000000L;
	long hex = 0xFFFF_FFFF_FFFF_FFFFL;
	
	int octNum = 010; //8진수 10진수로 8
	int hexNum = 0x10; //16진수 10, 10진수로는 16
	int binNum = 0b10; //2진수 10, 10진수로는 2
	
	System.out.printf("b=%d%n",b); //b=1
	System.out.printf("s=%d%n",s); //s=2
	System.out.printf("c=%c, %d%n",c,(int)c); //c=A, 65
	System.out.printf("finger=[%5d]%n",finger);// finger=[   10]
	System.out.printf("finger=[%-5d]%n",finger);// finger=[10   ];
	System.out.printf("finger=[%05d]%n",finger);// finger=[00010];
	System.out.printf("big=%d%n", big);//big=100000000000
	System.out.printf("hex=%#x%n",hex); //#은 접두사(16진수 0x, 8진수 0) 
	//hex = 0xFFFF_FFFF_FFFF_FFFF
	System.out.printf("octNum=%o, %d%n", octNum, octNum);// octNum=10, 8
	System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);//hexNum=10, 16 
	System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum)
			, binNum);//binNum=10, 2
	

	}

}
