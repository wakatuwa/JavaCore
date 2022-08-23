package testProgram4;
/**
 * a class of Integer
 * @author wanghan
 *
 */
public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public boolean isEven() {
		return this.value%2 == 0 ? true : false;
	}

	public boolean isOdd() {
		return this.value%2 == 0 ? false : true;
	}

	public boolean isPrime() {
		if( this.value ==1 || this.value == 0) {
			return false;
		}
		for(int i = 2; i*i<=this.value; i++) {
			if(this.value%i==0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(int value) {
		return value%2 == 0 ? true : false;
	}

	public static boolean isOdd(int value) {
		return value%2 == 0 ? false : true;
	}

	public static boolean isPrime(int value) {
		if( value == 1 || value == 0) {
			return false;
		}

		for(int i = 2; i*i<=value; i++) {
			if(value%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger mi) {
		return mi.value % 2 == 0 ? true : false;
	}

	public static boolean isOdd(MyInteger mi) {
		return mi.value % 2 == 0 ? false : true;
	}

	public static boolean isPrime(MyInteger mi) {
		if(mi.value == 1 || mi.value == 0) {
			return false;
		}
		for(int i = 2; i*i <= mi.value; i++) {
			if(mi.value%i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean equals(int value) {
		return this.value == value ? true : false;
	}

	public boolean equals(MyInteger mi) {
		return this.value == mi.value ? true : false;
	}

	public static int parseInt(char[] arr) {
		int result = arr[0];
		return result;

	}

	public static int parseInt(String ss) {
		return Integer.parseInt(ss);
	}

	public static void main(String[] args) {
		MyInteger mi = new MyInteger(100);
		MyInteger mi2 = new MyInteger(6);
		MyInteger mi3 = new MyInteger(100);
		char[] arr = {66};
		String ss = "123";

		System.out.println(isPrime(mi));
		System.out.println(isPrime(mi2));
		System.out.println(mi.equals(mi2));
		System.out.println(mi.equals(mi3));
		System.out.println(parseInt(arr));
		System.out.println(parseInt(ss));
	}
}
