/**
 * 
 */
package ss.self.jb.guess;

/**Guessing game between 1-100
 * @author Ryan Knapp
 *
 */
import java.util.Scanner;

public class NumberGuess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create random number
		int randomNum = (int) (Math.random() * 100);

		// declaring variables
		int max = randomNum + 10;
		int min = randomNum - 10;
		int count;

		// create scanner for user input
		Scanner sc = new Scanner(System.in);

		// loop 5 times
		for (count = 0; count < 5; count++) {
			// get user input
			int input = sc.nextInt();

			if (input >= min && input <= max) { // if input is within 10 of random number
				System.out.println("You were within 10 of " + randomNum + "!");
				break;
			} else if (count < 4) { // doesn't print on last try
				System.out.println("Try again");
			}
		}
		// lost game
		if (count == 5) {
			System.out.println("Sorry, the number was " + randomNum);
		}
	}

}
