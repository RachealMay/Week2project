
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5a. 1 - 100 loop
		int firstLoop = 0;
		while (firstLoop <= 100) {
			System.out.println(firstLoop);
			firstLoop++;
		}
		System.out.println(" ");
		// 5b Every third number going backwards from 100 - 0
		int secondLoop = 100;
		while (secondLoop >= 0) {
			System.out.println(secondLoop);
			secondLoop = secondLoop - 3; 
		}
		System.out.println(" ");
		// 5c Every other number from 1- 100
		int loopThree;	
		for (loopThree = 1; loopThree <= 100; loopThree += 2) {
			System.out.println(loopThree);
		}
		System.out.println(" ");
		//5D. 1-100, Divisible by 3- Hello, Divisible by 5-World, by 3 and 5 Hello World
		int loopFour;
		for (loopFour = 0; loopFour <= 100; loopFour += 1) {
			if (loopFour % 3 == 0 && loopFour % 5 == 0) {
				System.out.println("Hello World");
			}
			else if (loopFour % 3 == 0) {
				System.out.println("Hello");
			}
			else if (loopFour % 5 == 0) {
				System.out.println("world");
			}
			else {
				System.out.println (loopFour);
			}
			}
		}
	}




