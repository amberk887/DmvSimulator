import java.util.Random;

public class DmvSimulator {
	public static void main (String []args) {
		System.out.println("Hi! Welcome to the DMV!");
		Random r = new Random();
		int min = 1;
		int max = 200;
		int randomNum = r.nextInt(max-min)+min;
		System.out.println("Your number is "+randomNum+ ". Please wait for your number to be called.");
		for (int i = randomNum+1; i<=max;i++ ) {
			System.out.println(i);
		}
		for (int i = min; i<=randomNum;i++) {
			System.out.println(i);
		}
		int randomNum2 = r.nextInt(max-min)+min;
		if (randomNum2 == 3) {
			System.out.println("You have all your papers, you're set.");
		}
		else {
			System.out.println("Oh, of course. You don't have the required documents. I don't know why I expected you to. Thanks for wasting my time.");

		}

		
	}

}
