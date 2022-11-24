package chapter05;

public class Ex5_03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		//배열 arr에 1~5를 저장한다
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		System.out.println("[변경전]");
		System.out.println("arr.length:"+arr.length);//5
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);//1,2,3,4,5
		}
		
		int[] tmp = new int[arr.length*2];
		
		//배열 arr에 저장된 값들을 배열 tmp에 복사한다.
		for(int i=0; i<arr.length; i++) {
			tmp[i]=arr[i];
		}
		
		arr=tmp; //tmp에 저장된 값을 arr에 저장한다
		
		System.out.println("[변경후]");
		System.out.println("arr.length:"+arr.length);//10
		for(int i=0; i<arr.length; i++) {//1,2,3,4,5,0,0,0,0,0
			System.out.println("arr["+i+"]:"+arr[i]);
		}

	}

}
