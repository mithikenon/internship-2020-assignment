package Polymorphism_Abstraction;

public class Application {

	public static void main(String[] args) {
		HRDepartment dept=new HRDepartment();
		dept.work();
		dept.call();
		System.out.println("");
		
		AdminDepartment admin=new AdminDepartment();
		admin.work();
		admin.call();
		admin.requestAccess();
		System.out.println("");
		
		AccountDepartment account=new AccountDepartment();
		account.work();
		account.call();
		account.isMoreInvestmentOK();
		System.out.print("");
	}

}
