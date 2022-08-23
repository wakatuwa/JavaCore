package testProgram6;

import java.util.Scanner;

/**
 * 字符串加密，每个字母转换为下一个字母
 * 字符串解密，解除加密
 * @author wanghan
 *
 */
public class Test6_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要加密的字符串：");
		String ss = sc.nextLine();


		System.out.println("加密后的字符串：" + jiaMi(ss));
		System.out.println("解密后的字符串：" + jieMi(jiaMi(ss)));
	}

	public static String jiaMi(String ss) {
		char[] arr = ss.toCharArray();
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]=='Z'||arr[i]=='z') {
				arr[i] = (char)(arr[i] - 25);
			} else {
				arr[i] = (char)(arr[i] + 1);
			}
		}
		String result = new String(arr);
		return result;
	}

	public static String jieMi(String ss) {
		char[] arr = ss.toCharArray();
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]=='A'||arr[i]=='a') {
				arr[i] = (char)(arr[i] + 25);
			} else {
				arr[i] = (char)(arr[i] - 1);
			}
		}
		String result = new String(arr);
		return result;
	}
}
