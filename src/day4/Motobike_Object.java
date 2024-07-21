package day4;

public class Motobike_Object {
	
	static String hangXe;
	static String mauXe;
	static String bienSo;
	static String ngayDangKy;
	
	public static String getInformationMotor()
	{
		return ("Hang xe: "+hangXe+", mau xe: "+mauXe+", bien so: "+bienSo+(", ngay dang ky: ")+ngayDangKy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motobike_Object xe1 = new Motobike_Object();
		xe1.hangXe = "Lead";
		xe1.mauXe = "Do";
		xe1.bienSo = "1234";
		xe1.ngayDangKy = "01/01/2024";
		System.out.println(xe1.getInformationMotor());
		
		Motobike_Object xe2 = new Motobike_Object();
		xe2.hangXe = "SH";
		xe2.mauXe = "Trang";
		xe2.ngayDangKy = "10/05/2024";
		System.out.println(xe2.getInformationMotor());
	}

}
