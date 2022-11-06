package chapter03;

public class Ex3_32 {

	public static void main(String[] args) {
		int x,y,z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x=10;
		y=-5;
		z=0;
		
		absX = x >=0 ? x : -x; // x>=0? true absX=10
		absY = y >=0 ? y : -y; // y>=0? false absY=5
		absZ = z >=0 ? z : -z; // z>=0? true absZ=0
		
		signX = x>0? '+':(x==0? ' ': '-'); // x>0? true singX=+
		signY = y>0? '+':(y==0? ' ': '-'); // y>0? false -> y=0? false -> signY=-
		signZ = z>0? '+':(z==0? ' ': '-'); // z>0? false -> z=0? true -> signZ=' '
		
		System.out.printf("x=%c%d%n",signX, absX); //x=+10;
		System.out.printf("y=%c%d%n",signY, absY); //y=-5;
		System.out.printf("z=%c%d%n",signZ, absZ); //z= 0;
		

	}

}
