package testProgram5;
/**
 *前后元素对换
 * @author wanghan
 *
 */
public class Test5_4 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("交换前：");
		for(int i: array)
			System.out.print(i + " ");

		int temp = 0;
		for(int i = 0; i<5; i++) {
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		System.out.println();
		System.out.println("交换后：");
		for(int i: array)
			System.out.print(i + " ");
	}
}
