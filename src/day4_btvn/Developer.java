package day4_btvn;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee developer1 = new Employee();
		developer1.setEmployeeID(1);
		developer1.setEmployeeName("Nguyen Van A");
		developer1.setEmployeeSalary(20500000);
		System.out.println("ID: "+developer1.getEmployeeID()+ ", Name: "+developer1.getEmployeeName()+ ", Salary: "+developer1.getEmployeeSalary());
		
		Employee developer2 = new Employee();
		developer2.setEmployeeID(2);
		developer2.setEmployeeName("Tran Van B");
		System.out.println("ID: "+developer2.getEmployeeID()+ ", Name: "+developer2.getEmployeeName()+ ", Salary: "+developer2.getEmployeeSalary());
	}

}
