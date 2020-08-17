package Polymorphism_Abstraction;

public class HRDepartment {

	private long id;
	private String companyName;
	private String departmentName;
	private int numberOfEmployee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	public void work() {
		System.out.println("HR Work....");
	}
	String message;
	public void call() {
		System.out.println("HR Comming.... : " + message);
	}
	
}