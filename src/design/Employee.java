package design;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	

	public int employeeId();
	

	public String employeeName();
	

    public void assignDepartment();
	

	public int calculateSalary();
	

	public void benefitLayout();

}
public class EmployeeImpl implements Employee {
	private int employeeId;
	private String employeeName;
	private List<String> departments;
	private int baseSalary;


	@Override
	public int employeeId() {
		return employeeId;
	}

	@Override
	public String employeeName() {
		return employeeName;
	}

	@Override
	public void assignDepartment() {
	}

	@Override
	public int calculateSalary() {
		return baseSalary;
	}

	@Override
	public void benefitLayout() {
	}
}
