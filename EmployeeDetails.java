package week1.day2;

public class EmployeeDetails {
	public static void main(String[] args) {
		EmployeeDetails company = new EmployeeDetails();
		company.printEmployeeName("Tamil",143);
		company.getEmployeeAddress("Bangalore");
		company.printEmployeeSalary(56789.54);
		company.printEmployeeMobileNumber(967764647);
	}
	
	public void printEmployeeName(String empName, int empid) {
		System.out.println("EmpName:" +empName);
		System.out.println("Empid:" +empid);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("EmpAddress:" +empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("EmpSalary:" +empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("MobileNumber:" +mobNum);
	}

}
