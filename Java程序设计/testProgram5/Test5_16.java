package testProgram5;

import java.util.Scanner;

/**
 * 返回二维数组中最大元素的位置
 * @author wanghan
 *
 */
public class Test5_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入数组的行数和列数： ");
		int rank = scan.nextInt();
		int row = scan.nextInt();
		double[][] arr = new double[rank][row];
		System.out.println("请输入每行元素值： ");
		for(int i =0; i<rank; i++) {
			for(int j = 0; j<row; j++) {
				arr[i][j] = scan.nextDouble();
			}
			System.out.println();
		}

		System.out.println("最大元素的位置是(" + locateLargest(arr)[0] + "," + locateLargest(arr)[1] + ")。");
	}

	public static int[] locateLargest(double [][] a) {
		int[] result = new int[2];
		double max = Integer.MIN_VALUE;
		for(int i = 0; i<a.length; i++) {
			for(int j= 0; j<a[0].length; j++) {
				if(a[i][j]>max) {
					max = a[i][j];
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}
}
