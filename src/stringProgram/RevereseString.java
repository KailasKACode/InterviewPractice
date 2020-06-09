package stringProgram;

import java.util.Scanner;

public class RevereseString {
	public static void main(String[] args) {
		System.out.println("Enter the name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(" " + name.charAt(i));
		}

	}

}
