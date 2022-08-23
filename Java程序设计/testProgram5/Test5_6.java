package testProgram5;
/**
 * 输出Fibonacci数列
 * @author wanghan
 *
 */
public class Test5_6 {
	public static void main(String[] args) {
		int[] arr = new int[20];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = Fibonacci(i+1);
		}
		
		for(int i: arr)
			System.out.print(i + " ");

	}

	public static int Fibonacci(int num) {
		if(num == 1 || num ==2)
			return 1;
		return Fibonacci(num-1) + Fibonacci(num-2);
	}
}
