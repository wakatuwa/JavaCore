package testProgram5;

import java.util.Scanner;

/**
 * 编写一个方法，求一个double型数组中最小元素
 * @author wanghan
 *
 */
public class Test5_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入double型数组的长度：");
		int len = scan.nextInt();
		double[] array = new double[len];
		for(int i = 0; i<array.length; i++) {
			array[i] = scan.nextDouble();
		}
		System.out.println(min(array));
	}

	public static double min(double[] array) {
		double min = array[0];
		for(int i = 1; i<array.length; i++) {
			if(min>array[i])
				min = array[i];
		}
		return min;
	}
}
