package day03;
/*보조제어문 : break, continue
 * break;
 * continue;
 * break 레이블명;
 * continue 레이블명;
 * */
public class BreakContinue {

	public static void main(String[] args) {
		//결과를 예측하세요
		System.out.println("1----------------");
		for(int i=0; i<3; i++) {
			if(i==1) break;//조건에 부합하면 아래 문장을 실행하지 않고 반복문을 중지함
			System.out.println("i: "+i); //i:0
		}
		
		System.out.println("2----------------");
		for(int i=0; i<3; i++) {
			if(i==1) continue;//조건에 부합하면 아래 문장을 실행하지 않고 반복문을 계속 수행함
			System.out.println("i: "+i); //i:0, i:2
		}
		
		System.out.println("3.----------------");
		for (int i=0;i<3 ;i++ )
		{
			for (int k=0; k<3;k++ )
			{
				if(k==1) break; //
				System.out.println("i="+i+", k="+k);//i:0 k:0, i:1 k:1, i:2 k:2
			}
			
		}//for--------
		
		System.out.println("4.----------------");
		for (int i=0;i<3 ;i++ )
		{
			for (int k=0; k<3;k++ )
			{
				if(k==1) continue;
				System.out.println("i="+i+", k="+k);// i:0 k:0, i:0 k:2, i:1 k:0, i:1 k:2, i:2 k:0, i:2 k:2
			}
		}//for--------

		System.out.println("5.----------------");
		outer: //label => 반복문 바로 앞에 붙일 수 있다
		for (int i=0;i<3 ;i++ )
		{
			inner:
			for (int k=0; k<3;k++ )
			{
				if(k==1) break outer; //지정된 label과 가까운 반복문을 이탈한다
				System.out.println("i="+i+", k="+k);//0 0, 
			}//for--
			
		}//for--------
		
		System.out.println("5.----------------");
		outer: //label => 반복문 바로 앞에 붙일 수 있다
		for (int i=0;i<3 ;i++ )
		{
			inner:
			for (int k=0; k<3;k++ )
			{
				if(k==1) continue outer; //지정된 label과 가까운 반복문을 계속 수행한다
				System.out.println("i="+i+", k="+k);//0 0,1 0,2 0
			}//for--
			
		}//for--------
		
		
		
	}

}
