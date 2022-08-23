package testProgram6;

import java.util.Scanner;

/**
 * 检测国际标准书号是否合法
 * @author wanghan
 *
 */
public class Test6_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串书号:");
		String ss = sc.nextLine();

		if(isLegal(ss))
		System.out.println("该书号合法!");
		else {
			System.out.println("该书号不合法!");
		}
//		String bb = "978-7-111-50690-47";
//		System.out.println(isLegal(bb));
	}

	public static boolean isLegal(String ss) {
		String pattern = "^\\d{3}-\\d-\\d{3}-\\d{5}-\\d$";
		return ss.matches(pattern);
	}
}
