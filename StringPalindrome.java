import java.util.*;
import java.util.Scanner;

class StringPalindrome {
	public static void main(String args[]) {
		int n, flag = 0;
		Scanner scan = new Scanner(System.in);
		String palindrome = scan.nextLine();
		char[] str = palindrome.toCharArray();
		n = str.length;
		for (int i = 0; i < n; i++) {
			if (str[i] != str[n - i - 1])
				flag = 1;
			break;
		}
		if (flag == 0)
			System.out.println("The Entered String is a Palindrome");
		else
			System.out.println("No the String is not a Palindrome");
	}
}
