package testProgram5;
/**
 * 可变参数
 * @author wanghan
 *
 */
public class VarargsDemo {
	public static double average(double ... values) {
		double sum = 0;
		for(double value: values) {
			sum = sum + value;
		}
		double average = sum / values.length;
		return average;
	}
	public static void main(String[] args) {
		System.out.println(average(60, 70, 86));
	}
}
