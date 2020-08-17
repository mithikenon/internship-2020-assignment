package Polymorphism_Abstraction;

public class AdminDepartment {

	private long id;
	private String companyName;
	private String departmentName;
	private int numberOfEmployee;
	private double costLimit;

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

	public double getCostLimit() {
		return costLimit;
	}

	public void setCostLimit(double costLimit) {
		this.costLimit = costLimit;
	}

	public void work() {
		System.out.println("Admin Work....");
	}
	String message;
	public void call() {
		System.out.println("Admin Comming.... : " + message);
		System.out.println("Admin Specific Reports.....");
	}
	double cost;
	public void requestAccess() {
		String message = cost < this.costLimit ? "Right on way!" : "Over the Limit";
		System.out.println(message);
	}
   
}