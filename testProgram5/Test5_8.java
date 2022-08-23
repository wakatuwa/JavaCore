package testProgram5;

import java.util.Arrays;

/**
 * 合并两个数组，并以升序排序
 * @author wanghan
 *
 */
public class Test5_8 {
	public static void main(String[] args) {
		int[] a = {16, 13, 15, 18};
		int[] b = {29, 36, 100, 9};

		int[] res = new int[a.length + b.length];
		for(int i = 0; i<a.length; i++) {
			res[i] = a[i];
		}
		for(int i = 0; i<b.length; i++) {
			res[a.length + i] = b[i];
		}
		Arrays.sort(res);
		System.out.println("合并后的数组：");
		for(int i: res){
			System.out.print(i + " ");
		}
	}
}
