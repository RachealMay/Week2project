
public class Week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 1
		System.out.println(true && true);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1 < 5);
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println("Hello".charAt(0) == 'h');
		System.out.println(" ");
		//Step 2
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyinPocket = true;
		//Step 3
		double costOfmilk = 2.99;
		double moneyInwallet = 17.25; 
		int thirstLevel = 5;
		//Step 4
		boolean shouldBuyicecream = isHotOutside && hasMoneyinPocket; 
		boolean willGoswimming = isHotOutside && !isWeekday; 
		boolean isAgoodDay = isHotOutside && hasMoneyinPocket && !isWeekday; 
		boolean willBuymilk = isHotOutside && thirstLevel >= 3 && moneyInwallet > 2 * costOfmilk; 
		System.out.println(shouldBuyicecream);
		System.out.println(willGoswimming);
		System.out.println(isAgoodDay);
		System.out.println(willBuymilk);
		}
	}
