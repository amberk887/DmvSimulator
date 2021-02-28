import java.util.Random;

public class DmvSimulator {
	public static void main (String []args) {
		System.out.println("Hi! Welcome to the DMV!");
		Random r = new Random();
		int min = 1;
		int max = 100;
		int randomNum = r.nextInt(max-min)+min;
		System.out.println("Your number is "+randomNum+ ". Please wait for your number to be called.");
		for (int i = randomNum+1; i<=max;i++ ) {
			System.out.println(i);
		}
		for (int i = min; i<=randomNum;i++) {
			System.out.println(i);
		}
		System.out.println("Sorry you don't have the required documents. Please come back another day.");
		
	}

}
