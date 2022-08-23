package testProgram5;
/**
 * 约瑟夫环问题
 * @author wanghan
 *
 */
public class Test5_12 {
	public static void main(String[] args) {
		int[] arr = new int[12];
		int count = 1;
		int flag = 0;
		for(int i = 0; i<12; i++) {
			arr[i] = i+1;
			flag += i;
		}
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		while(flag > 0) {
			for(int i = 1; i<12; i++) {
				if(arr[i]==0)
					continue;

				arr[i] = count;
				count++;
				if(arr[i] == 5) {
					System.out.print(i + " ");
					count = 1;
					arr[i] = 0;
					flag -= i;
				}
			}

		}

	}

}
