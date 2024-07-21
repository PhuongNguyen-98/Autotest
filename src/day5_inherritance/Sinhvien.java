package day5_inherritance;

public class Sinhvien extends Nguoi {
	// thuoc tinh mo rong: maSV, soTinChi
	// Override diChoi()
	// mo rong : diHoc()
	private String maSV;
	private int soTinChi;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public int getSoTinChi() {
		return soTinChi;
	}
	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}
	
	@Override
	public void diChoi()
	{
		System.out.println("Hoc het bai thi di choi");
	}
	
	public void diHoc()
	{
		System.out.println("Hoc 5 ngay mot tuan");
	}
	
}
