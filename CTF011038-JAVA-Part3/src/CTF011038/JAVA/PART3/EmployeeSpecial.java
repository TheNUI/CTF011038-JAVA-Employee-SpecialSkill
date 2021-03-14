package CTF011038.JAVA.PART3;

public class EmployeeSpecial extends Employee{
	String specialSkill;
	
	public EmployeeSpecial(String firstname, String lastname, int salary, String position) {
		super(firstname, lastname, salary, position);
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary=salary;
		this.position=position;
	}

	public void Introduce() {
		System.out.println("My name is "+firstname+" "+lastname+ " and my special skill is "+"Fast Eating");
	}
}

