package testProgram5;

import java.util.Scanner;

/**
 * 模拟杨辉三角
 * @author wanghan
 *
 */
public class Triangle {
	public static void main(String[] args) {
		int i, j;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入杨辉三角层数：");
		int level = input.nextInt();
		int triangle[][] = new int[level][];
		for(i = 0; i<triangle.length; i++)
			triangle[i] = new int[i+1];
		//赋值
		triangle[0][0] = 1;
		for(i = 1; i<triangle.length; i++) {
			triangle[i][0] = 1;
			for(j = 1; j<triangle[i].length-1; j++)
				triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
			triangle[i][triangle[i].length-1] = 1;
		}
		//打印
		for(i = 0; i<triangle.length; i++) {
			for(j = 0; j<triangle[i].length; j++)
				System.out.print(triangle[i][j] + " ");
			System.out.println();
		}

	}
}
