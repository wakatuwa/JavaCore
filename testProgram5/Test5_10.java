package testProgram5;

import java.util.Arrays;

/**
 * 使用筛选法求出2~100的所有素数
 * @author wanghan
 *
 */
public class Test5_10 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i = 0; i<100; i++)
			arr[i] = i;
		for(int i=0; i<100; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		arr[1] = 0;

		int m = (int)Math.sqrt(100);
		for(int i = 2; i<=m; i++) {
			if(arr[i]!=0) {
				for(int j = 2*i; j<100; j+=i) {
					arr[j]  = 0;
				}
			}
		}

		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}
