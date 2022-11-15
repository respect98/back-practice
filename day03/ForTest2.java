package day03;

public class ForTest2 {

	public static void main(String[] args) {
		for(int i=1; i<3; i++) {//2
			for(int k=1; k<4; k++) {//3
				System.out.println("i="+i+", k="+k);
				}//------for k
			System.out.println("--------------");
		}//----for i
		/*[1]
		 *   *****
		 *   *****
		 *   *****
		 *   *****
		 *   4행 5열
		 * */
		for(int i=1; i<5; i++) {
		for(int k=1; k<6; k++) {
			System.out.print("*");
		}
		System.out.print("\n");
		}
		System.out.println("----------------");
		
		/*[2]
		 *   *
		 *   **
		 *   ***
		 *   ****
		 * */
		for(int i=0; i<4; i++) {
			for(int k=0; k<=i; k++) {
			System.out.print("*");
		} System.out.println("");
		}
		System.out.println("----------------");
		/*[3]
		 *       *
		 *      **
		 *     ***
		 *    ****/
		for(int i=0; i<4; i++) {
			for(int k=0; k<4; k++) {
				if(i+k<3) {
			System.out.print(" ");
		} else
			System.out.print("*");
		}System.out.println("");		
	}
		System.out.println("----------------");
//		for(int i=0;i<4;i++){
//			for(int k=4;k>0;k--){
//				if(i<k){
//					System.out.print(" ");
//				}else{
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}
//		(0,0)(0,1)(0,2)(0,3)(0,4)(0,5)(0,6)
//		(1,0)(1,1)
		
		
		
		//[4]피라미드 모양
//		for(int i=0;i<4;i++){
//			for(int k=0;k<3-i;k++){
//				System.out.print(" "); 
//			}
//			for(int k=0;k<2*i+1;k++){
//				System.out.print("*"); 
//			}
//			System.out.println("");
//		}
//		System.out.println("----------------");
		
		for(int i=0; i<3; i++) {
			for(int k=0; k<5; k++) {
				if((i+k>=2) & (k-i<=2))
				System.out.print("*");
				else
				System.out.print(" ");
			}
		System.out.println();
		}
		
	}
}
