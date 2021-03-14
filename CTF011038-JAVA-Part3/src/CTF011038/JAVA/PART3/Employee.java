package CTF011038.JAVA.PART3;

public class Employee {
	String firstname;
	String lastname;
	int salary;
	String position;

public Employee(String firstname, String lastname, int salary, String position) {
	}
public void hello() {
	System.out.println("My name is "+ firstname);
}

public void checkPosition() {
	System.out.println("My position is "+position);

}
}