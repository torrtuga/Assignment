package june;

import java.util.Scanner;

public class ModuleFour {

	public static void main(String[] args) throws NegativeValuesException {
		int i, fact = 1;
		Scanner sc = new Scanner(System.in);
		int number = 0;
		if (sc.hasNextInt())
			number = sc.nextInt();
		else
			throw new NumberFormatException();
		if (number < 0) throw new NegativeValuesException();
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
