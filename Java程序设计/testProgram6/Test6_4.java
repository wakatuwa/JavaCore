package testProgram6;
/**
 * 统计一个字符串中包含字母的个数
 * @author wanghan
 *
 */
public class Test6_4 {
	public static void main(String[] args) {
		String ss = "Beijinhfkjg 2008";
		System.out.println("字符串包含的字母个数："+ countLetters(ss));
	}

	public static int countLetters(String s) {
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			if(Character.toString(s.charAt(i)).matches("[a-zA-Z]"))
				count++;
		}
		return count;
	}
}
