package testProgram6;
/**
 * 输出格式测试
 * @author wanghan
 *
 */
public class PrintfTest {
	public static void main(String[] args) {
		System.out.printf("yaer = |%6d|%n", 2017);
		System.out.printf("%8d%n", (int)23.45);
		System.out.printf("|%8.3f|%n", 2017.1234);
		System.out.printf("|%10.2e|%n", 123.567);
		byte b = 65;
		System.out.printf("b = %c%n", b);
		byte a = 0;
		String s = null;
		System.out.printf("a1 = %b%n", a);
		System.out.printf("a2 = %b%n", true);
		System.out.printf("a3 = %b%n", s);

		System.out.printf("a1 = %s%n", a);
		System.out.printf("a2 = %s%n", true);
		System.out.printf("a3 = %s%n", s);



	}
}
