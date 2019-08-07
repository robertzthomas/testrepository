
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main boolean statements
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = false;
		double costOfMilk = 3.06;
		int moneyInWallet = 6;
		int thirstLevel = 9;
		// boolean operations 
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && (isWeekday == false );
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && (isWeekday == false);
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= (costOfMilk * 2));
		// sysout main boolean statements
		System.out.println("is hot outside = " + isHotOutside);
		System.out.println("is weekday = " + isWeekday);
		System.out.println("has money in pocket = " + hasMoneyInPocket);
		System.out.println("cost of milk = " + costOfMilk);
		System.out.println("money in wallet = " + moneyInWallet);
		System.out.println("thirst level = " + thirstLevel);
		//sysout boolean operations 
		System.out.println("should buy ice cream = " + shouldBuyIceCream);
		System.out.println("will go swimming = " + willGoSwimming);
		System.out.println("is a good day = " + isAGoodDay);
		System.out.println("will buy milk = " + willBuyMilk);
		
	}

}
