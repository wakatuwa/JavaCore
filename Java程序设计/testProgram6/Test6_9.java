package testProgram6;
/**
 * 将字符串分割成字符串数组
 * @author wanghan
 *
 */
public class Test6_9 {
	public static void main(String[] args) {
		String str = "no pains, no gains.";
		String[] result = str.split(" |,");
		for(int i = 0; i<result.length; i++) {
			System.out.print(result[i]+ " ");
		}
	}
}
