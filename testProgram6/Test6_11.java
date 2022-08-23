package testProgram6;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 输入三个城市名，从小到大输出
 * @author wanghan
 *
 */
public class Test6_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];
		System.out.println("请输入三个城市：");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.next();	//不用nextline
		}
		String[] result = arr;
		Arrays.sort(result);
		System.out.println("三个城市从小到大顺序是：");
		for(String s: result) {
			System.out.println(s);
		}
	}

}
