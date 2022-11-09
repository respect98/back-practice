package chapter05;

public class Ex5_10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		/*print하는 동시에 저장이 된것
		 * numArr[i]=(int)(Math.random()*10)
		 * System.out.print(numArr[i])
		 * 이걸 밑에 처럼 한번에 표현할 수 있다*/
		
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10));//0~9까지의 숫자 numArr 프린트
		}
		System.out.println();

		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false; //자리바꿈이 발생했는지를 체크한다.
			
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j]> numArr[j+1]) {//옆의 값이 작으면 서로 바꾼다
					int temp = numArr[j];
					numArr[j]=numArr[j+1];
					numArr[j+1]=temp;
					changed=true; //자리바꿈이 발생했으니 changed를 true로
				}
			}//for j
			
			if(!changed) break; // 자리바꿈이 없을 때 반복문을 벗어난다
			//if문은 안의 조건이 true일때 그 문장을 수행함
			
			for(int k=0; k<numArr.length; k++){
				System.out.print(numArr[k]);//정렬된 결과를 출력한다.
			}
			System.out.println();
		}//for i
	}

}
