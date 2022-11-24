package day05;

public class CoffeeShop {

	public static void main(String[] args) {
		// 밀크 커피 내오기
		VendingMachine vm = new VendingMachine();
		vm.makeTea(1, 2, 3);

		// 설탕 커피 내오기
		vm.makeTea(4, 5);

		// 블랙 커피 내오기
		System.out.println(vm.makeTea(6));

		// 크림 커피 내오기
		vm.makeTea((short) 7, 8);
		
		// 유자차 내오기
		Yuja y = new Yuja();
		y.setSugar(1);
		y.setYuja(2);
		vm.makeTea(y);
	
	
	}



}
