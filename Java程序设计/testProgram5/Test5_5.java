package testProgram5;
/**
 * 选择排序法
 * @author wanghan
 *
 */
public class Test5_5 {
	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2};
		int min = Integer.MAX_VALUE;
		int pos = 0;
		int temp = 0;
		for(int i = 0; i<8; i++) {
			for(int j = i; j<8; j++) {
				if(min > arr[j]) {
					min = arr[j];
					pos = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
			min = Integer.MAX_VALUE;
			pos = 0;
		}

		System.out.println("排序后：");
		for(int i: arr)
			System.out.print(i + " ");
	}
}
