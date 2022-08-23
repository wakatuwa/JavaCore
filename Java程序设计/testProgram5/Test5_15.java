package testProgram5;
/**
 * 矩阵计算
 * @author wanghan
 *
 */
public class Test5_15 {
	public static void main(String[] args) {
		int[][] a = {
			{1, 3, 5,},
			{-3, 6, 0},
			{13, -5, 7},
			{-2, 19, 25}
		};
		int[][] b = {
			{0, -1, -2},
			{7, -1, 6},
			{-6, 13, 2},
			{12, -8, -13}
		};

		int[][] add = new int[4][3];
		int[][] minus = new int[4][3];
		int[][] reverse = new int[3][4];
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				add[i][j] = a[i][j] + b[i][j];
				minus[i][j] = a[i][j] - b[i][j];
			}
		}
		for(int i = 0; i<a[0].length; i++) {
			for(int j=0; j<a.length; j++) {
				reverse[i][j] = a[j][i];
			}
		}
		System.out.println("add = ");
		for(int i = 0;i<4; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(add[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println("minus = ");
		for(int i = 0;i<4; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(minus[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println("reverse = ");
		for(int i = 0;i<3; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(reverse[i][j] + ", ");
			}
			System.out.println();
		}

	}
}
