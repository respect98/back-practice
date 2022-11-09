package chapter05;

public class Ex5_01 {

	public static void main(String[] args) {
		int[] score = new int[5];
		int k =1;
		
		score[0]=50;
		score[1]=60;
		score[k+1]=70;
		score[3]=80;
		score[4]=90;
		
		int tmp = score[k+2] + score[4]; //80+90 = 170;
		
		//for문으로 배열의 모든 요소를 출력한다.
		for(int i=0; i<5; i++) {
			System.out.printf("score[%d]:%d%n",i,score[i]);
		}
		
		System.out.printf("tmp:%d%n",tmp); //tmp:170
		System.out.printf("score[%d]:%d%n",7,score[7]);//score[7]범위벗어남  java.lang.ArrayIndexOutOfBoundsException : Index 7 out of bounds for length 5
	
	}

}
