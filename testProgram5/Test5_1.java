package testProgram5;

import java.util.Scanner;

/**
 * 键盘输入
 * @author wanghan
 *
 */
public class Test5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数组长度：");
		int len = input.nextInt();
		int[] array = new int[len];
		for(int i = 0; i<len; i++) {
			array[i] = input.nextInt();
		}

		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<len; i++) {
			sum += array[i];
			if(array[i]>max)
				max = array[i];
			if(array[i] < min)
				min = array[i];
		}
		double ave = sum/5;

		System.out.println("数组长度:" + array.length);
		System.out.println("最大值：" + max);
		System.out.println("最小值：" + min);
		System.out.println("平均值：" + ave);
	}
}
