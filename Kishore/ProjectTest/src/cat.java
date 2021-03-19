
public class cat {

	String name;
	int age;
	String color;
	
public void sleep() {
	System.out.println("cat is sleeping");
}
public int eat() {
	
	return age;
}
void feed() {
	System.out.println("Cat is having food");
}

public static void Main(String[] args) {
	cat thor = new cat();
	cat Rambo = new cat();
	
	thor.name = "Thor";
	thor.sleep();
	
}}
