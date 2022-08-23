package testProgram6;
/**
 * 将十进制转换成二进制
 * @author wanghan
 *
 */
public class Test6_5 {
	public static void main(String[] args) {
		System.out.println(toBinary(10));
	}

	public static String toBinary(int value) {
		String str = "";
		while(value!=0) {
			str = value%2 + str;
			value = value/2;
		}
		return str;
	}
}
