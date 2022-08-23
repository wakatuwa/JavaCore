package testProgram6;

import java.util.Scanner;

/**
 * 输入字符串，显示长度和首尾字符
 * @author wanghan
 *
 */
public class Test6_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String ss = sc.nextLine();
		System.out.println("字符串的长度:" + ss.length());
		System.out.println("首字符： " + ss.charAt(0) + "\n" + "尾字符：" + ss.charAt(ss.length()-1));

	}
}
