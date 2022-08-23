package testProgram4;
/**
 *
 * @author wanghan
 *
 */
public class Counter {
	public int x;
	public static int y = 0;
	public Counter() {
		x = 100;
	}
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		c1.y = 100;
		c2.y = 200;
		System.out.println(c1.y);
	}
}
