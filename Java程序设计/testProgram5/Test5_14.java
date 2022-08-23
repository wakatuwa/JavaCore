package testProgram5;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * 分解质因数
 * @author wanghan
 *
 */
public class Test5_14 {
	public static void main(String[] args) {
		System.out.println("请输入一个正整数：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int temp = num;
		Stack<Integer> ss = new Stack<>();
		int i = 2;

		while(i<=num) {
			if(num%i==0) {
				ss.push(i);
				num = num/i;

				i = 2;
			} else {
				i++;
			}
		}
		while(!ss.empty()) {
			System.out.print(ss.pop() + " * ");
		}
		System.out.println("1 = " + temp);
	}
}
