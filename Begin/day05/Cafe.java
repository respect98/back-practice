package day05;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm =new CoffeeMachine();
//		cm.coffee=1;
		cm.setCoffee(1);
		
//		cm.sugar=2;
		cm.setSugar(2);
		
//		cm.cream=3;
		cm.setCream((short)3);
		
		System.out.printf("커피: %d%n", cm.getCoffee());//cm.coffee[x]
		System.out.printf("설탕: %d%n", cm.getSugar());
		System.out.printf("크림: %d%n", cm.getCream());

	}////////////////////////

}
