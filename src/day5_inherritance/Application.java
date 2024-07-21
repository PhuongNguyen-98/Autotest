package day5_inherritance;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sinhvien sv1 = new Sinhvien();
		sv1.setHoTen("Nguyen Van A");
		sv1.setMaSV("SV01");
		sv1.setNgaySinh("01/01/2008");
		sv1.setSoTinChi(20);
		System.out.println("Sinh vien: "+sv1.getHoTen()+ ","+sv1.getMaSV()+","+sv1.getNgaySinh()+","+sv1.getSoTinChi());
		sv1.diChoi();
		sv1.diHoc();
		
		Giaovien giaovien1 = new Giaovien();
		giaovien1.setHoTen("Tran Van B");
		giaovien1.setMaGV("GV01");
		giaovien1.setNgaySinh("02/05/1999");
		giaovien1.setSoNamKN("03");
		System.out.println("Giao vien: "+giaovien1.getHoTen()+","+giaovien1.getMaGV()+","+giaovien1.getNgaySinh()+","+giaovien1.getSoNamKN());
		giaovien1.diChoi();
		giaovien1.diDay();
		
		
		
	}

}
