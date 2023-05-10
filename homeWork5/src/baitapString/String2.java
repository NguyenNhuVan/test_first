package baitapString;

import java.util.Scanner;

public class String2 {
	static Scanner inp = new Scanner(System.in);

	public static boolean isE(char c) {
		return c == 'e' || c == 'E';
	}

	public static boolean isSign(char c) {
		return c == '-' || c == '+';
	}

	public static boolean isAlpha(char c) {
		return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
	}

	public static boolean isDigit(char c) {
		return c >= '0' && c <= '9';
	}

	public static boolean isFloat(String s) {
		if (s.length() == 0)
			return false;

		if (!isDigit(s.charAt(0)))
			return false;

		if (s.charAt(s.length() - 1) != '.' && !isDigit(s.charAt(s.length() - 1)))
			return false;

		boolean dec = false, e = false;
		for (int i = 0; i < s.length(); ++i) {
			char curr = s.charAt(i);
			if (isSign(curr)) {
				if (i > 0 && !isE(s.charAt(i - 1)))
					return false;
			} else if (curr == '.') {
				if (e || dec)
					return false;

				if (!(((i > 0) && isDigit(s.charAt(i - 1))) || ((i < (s.length() - 1)) && isDigit(s.charAt(i + 1)))))
					return false;

				dec = true;
			} else if (isE(curr)) {
				if (e)
					return false;

				if (isSign(s.charAt(i - 1)))
					return false;

				e = true;
			} else if (!isDigit(curr))
				return false;
		}
		return true;
	}

	public static boolean isInteger(String s) {
		if (s.length() == 0)
			return false;

		if (isAlpha(s.charAt(0)))
			return false;

		if (isSign(s.charAt(s.length() - 1)))
			return false;

		for (int i = 0; i < s.length(); ++i) {
			if (isSign(s.charAt(i)) && i > 0)
				return false;

			if (!isDigit(s.charAt(i)))
				return false;
		}
		return true;
	}

	public static void getSumSquare(String[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; ++i) {
			if (isFloat(arr[i]))
				sum += Math.pow(Double.parseDouble(arr[i]), 2);
			else {
				System.out.println("Invalid string");
				System.out.print("N/A");
				return;
			}
		}
		System.out.println("Valid string");
		System.out.print("Square sum: " + sum);
	}

	public static void main(String[] args) {
		String s = inp.nextLine();
		String[] arr = s.split(" ", 0);
		getSumSquare(arr);

	}
}
