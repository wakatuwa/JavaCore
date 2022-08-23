package testProgram4;
/**
 * 显示回文素数
 * @author wanghan
 *
 */
public class HviWen {

	public static boolean isPrime(int number){
		if( number == 1 || number == 0) {
			return false;
		}

		for(int i = 2; i*i<=number; i++) {
			if(number%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isHviWen(int number) {
		String str1 = number + "";
		StringBuilder str2 = new StringBuilder(str1);
		str2.reverse();
		for(int i = 0; i<str1.length(); i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int count = 1;
		int number = 1;
		while(count < 100) {
			if(isPrime(number) && isHviWen(number)) {
				if(count%10==0) {
					System.out.println(number);
				} else {
				System.out.print(number + " ");
				}
				count++;
			}
			number++;
		}
	}
}
