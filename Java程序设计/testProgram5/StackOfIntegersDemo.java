package testProgram5;
/**
 * 测试StackOfIntegers方法
 * @author wanghan
 *
 */
public class StackOfIntegersDemo {
	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();

		for(int i = 0; i<20; i++)
			stack.push(i);

		System.out.println(stack.peek());
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
