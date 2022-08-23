package testProgram6;

import java.util.Arrays;

/**
 * 字符串排序
 * @author wanghan
 *
 */
public class Test6_6 {
	public static void main(String[] args) {
		String ss = "morning";
		System.out.println(sort(ss));
	}

	public static String sort(String s) {
		char[] array = s.toCharArray();
		Arrays.sort(array);
		String result = new String(array);
		return result;
	}
}
