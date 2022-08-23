package testProgram4;
/**
 * a class of triangle
 * @author wanghan
 *
 */
public class Triangle {
	double a, b, c;
	public Triangle() {
		a = 0.0;
		b = 0.0;
		c = 0.0;
	}
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double area() {
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	public static void main(String[] args) {
		Triangle san = new Triangle(3.1, 4.2, 5.3);
		System.out.println(san.area());
	}
}
