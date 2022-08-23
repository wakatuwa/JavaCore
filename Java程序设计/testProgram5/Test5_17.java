package testProgram5;

import java.util.Scanner;

/**
 * 打印魔方
 * @author wanghan
 *
 */
public class Test5_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入魔方矩阵的大小(1~99): ");
		int n = scan.nextInt();

		int[][] arr = new int[n][n];
		int i, j, k;
		for( i = 0; i<n; i++) {
			for( j = 0; j<n; j++) {
				arr[i][j] = 0;
			}
		}

		j = n/2;
		arr[0][j] = 1;
		i = 0;
		int temp1;
		int temp2;
		for(k = 2; k<=n*n; k++) {
			i = i-1;
			j = j+1;
			if((i<0)&&(j==n)) {
				i = i+2;
				j = j-1;
			} else {
				if(i<0)
					i=n-1;
				if(j>n-1)
					j=0;
			}
			if(arr[i][j] == 0) {
				arr[i][j] = k;
			} else {
				i = i+2;
				j = j-1;
				arr[i][j] = k;
			}
		}

		for( i = 0; i<n; i++) {
			for( j = 0; j<n; j++) {
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
