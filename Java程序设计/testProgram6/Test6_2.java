package testProgram6;

import java.util.Scanner;

/**
 * 输入两个字符串，检测第二个字符串是否为第一个字符串的子串
 * @author wanghan
 *
 */
public class Test6_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个字符串:");
		String ss1 = sc.nextLine();
		System.out.println("请输入第二个字符串：");
		String ss2 = sc.nextLine();

		if(ss1.contains(ss2)) {
			System.out.println("ss2是ss1的子串。");
		} else {
			System.out.println("ss2不是ss1的子串。");
		}
	}
}
