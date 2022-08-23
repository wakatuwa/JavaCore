package testProgram5;
/**
 * 给定的两个数组各位之和
 * @author wanghan
 *
 */
public class Test5_7 {
	public static void main(String[] args) {
		int[] a = {1, 2, 4};
		int[] b = {2, 4, 6, 8};
		int[] c = {16, 13, 15, 18};
		int[] d = {29, 36, 100, 9};

		int[] result1 = sumArray(a, b);
		int[] result2 = sumArray(c, d);
		System.out.println("结果1：");
		for(int i: result1)
			System.out.print(i + " ");
		System.out.println();
		System.out.println("结果2：");
		for(int i: result2)
			System.out.print(i + " ");
	}

	public static int[] sumArray(int[] a, int[] b) {
		int[] result = new int[Math.max(a.length, b.length)];
			if(a.length<=result.length) {
				for(int i = 0; i<a.length; i++) {
					result[i] = a[i];
				}
				for(int j = 0; j<result.length; j++) {
					result[j] += b[j];
				}
			}

			if(b.length<result.length) {
				for(int i = 0; i<b.length; i++) {
					result[i] = b[i];
				}
				for(int j = 0; j<a.length; j++) {
					result[j] += a[j];
				}
			}

		return result;
	}
}
