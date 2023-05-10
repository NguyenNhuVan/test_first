package baitapString;

import java.util.Scanner;

public class String3 {
	static Scanner inp = new Scanner(System.in);

	public static void main(String[] args) {
		String s = inp.nextLine();
		Scanner data = new Scanner(s);
		int sumInt = 0;
		float sumFloat = 0.f;
		String sumString = "";
		while (data.hasNext()) {
			if (data.hasNextInt())
				sumInt += data.nextInt();
			else if (data.hasNextDouble())
				sumFloat += data.nextFloat();
			else {
				sumString += data.next();
				if (data.hasNext())
					sumString += " ";
			}
		}
		System.out.println("The sum of integer number: " + sumInt);
		System.out.println("The sum of float number: " + sumFloat);
		System.out.print("The sum of string: " + sumString);
		data.close();
	}
}
