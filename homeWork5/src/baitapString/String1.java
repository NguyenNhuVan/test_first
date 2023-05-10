package baitapString;

import java.util.Scanner;

public class String1 {
	static Scanner inp = new Scanner(System.in);

	public static String convertBinary(int n) {
		if (n <= 0)
			return "";

		StringBuilder res = new StringBuilder();
		while (n > 0) {
			res.append(n % 2 == 0 ? '0' : '1');
			n /= 2;
		}
		res.reverse();
		return new String(res);
	}

	public static String convertEngLish(int n) {
		if (n <= 0)
			return "";

		String num = Integer.toString(n), res = new String();
		for (int i = 0; i < num.length(); ++i) {
			switch (num.charAt(i)) {
			case '0':
				res += "zero";
				break;

			case '1':
				res += "one";
				break;

			case '2':
				res += "two";
				break;

			case '3':
				res += "three";
				break;

			case '4':
				res += "four";
				break;

			case '5':
				res += "five";
				break;

			case '6':
				res += "six";
				break;

			case '7':
				res += "seven";
				break;

			case '8':
				res += "eight";
				break;

			case '9':
				res += "nine";
				break;
			}
			if (i < num.length() - 1)
				res += " ";
		}
		return res;
	}

	public static void main(String[] args) {
		int n = inp.nextInt();
		System.out.println(convertBinary(n));
		System.out.print(convertEngLish(n));
	}
}
