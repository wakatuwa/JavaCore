package testProgram5;
/**
 * 数组的使用
 * @author wanghan
 *
 */
public class ArrayDemo {
	public static void main(String[] args) {
		double[] marks = new double[5];
		marks[0] = 79;
		marks[1] = 84.5;
		marks[2] = 63;
		marks[3] = 90;
		marks[4] = 98;
		System.out.println(marks[2]);
		System.out.println(marks.length);
		for(double e: marks) {
			System.out.println(e);
		}
	}
}
