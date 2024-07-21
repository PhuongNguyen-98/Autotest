package day4_encapsolution;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person student1 = new person();
		student1.name = "Nguyen Van A";
		student1.setPhoneNumber("0123456789");
		System.out.println("Ho ten: "+student1.name +", so dien thoai: "+student1.getPhoneNumber());
		
		person student2 = new person();
		student2.name = "Nguyen Van B";
		System.out.println("Ho ten: "+student2.name +", so dien thoai: "+student2.getPhoneNumber());
	}

}
