package testProgram5;
/**
 * 比较两个数组是否完全相同
 * @author wanghan
 *
 */
public class Test5_11 {
	public static void main(String[] args) {
		int[] a = {2, 4, 6, 8};
		int[] b = {2, 4, 6, 8};
		int[] c = {16, 13, 15, 18};

		System.out.println(equals(a, b));
		System.out.println(equals(b, c));
	}

	public static boolean equals(int[] list1, int[] list2) {
		if(list1.length!=list2.length)
			return false;
		for(int i = 0; i<list1.length; i++) {
			if(list1[i]!=list2[i]) {
				return false;
			}
		}
		return true;
	}
}
