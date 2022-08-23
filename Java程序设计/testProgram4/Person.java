package testProgram4;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void speak() {
		System.out.println("Name = " + this.getName());
		System.out.println("age = " + this.getAge());

	}

	public static void main(String[] args) {
		Person p1 = new Person("xiaoming", 15);
		p1.speak();
		p1.setAge(18);
		p1.setName("xiaohong");
		p1.speak();
	}


}
