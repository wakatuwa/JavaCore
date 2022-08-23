package testProgram6;

import java.util.Scanner;

/**
 * 判断输入的字符串是否是回文
 * @author wanghan
 *
 */
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个字符串： ");
		String s = sc.nextLine();

		if(isPalindrome(s))
			System.out.println(s + ": 是回文。 ");
		else
			System.out.println(s + "： 不是回文。");
	}

	public static boolean isPalindrome(String s) {
		int low = 0;
		int high = s.length()-1;
		while(low < high) {
			if(s.charAt(low)!=s.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
}
