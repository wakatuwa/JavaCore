package testProgram6;

import java.util.Scanner;

/**
 * 从命令行输入三个整数，输出其中最大值
 * @author wanghan
 *
 */
public class Test6_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个整数：");
		int[] arr = new int[3];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(temp<arr[i]) {
				temp = arr[i];
			}
		}
		System.out.println("三个整数中最大的值是： " + temp);
	}
}
