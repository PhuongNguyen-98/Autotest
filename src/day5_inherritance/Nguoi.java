package day5_inherritance;

public class Nguoi {
	// thuoc tinh private: hoTen, tuoi, ngaySinh => getter va setter
	// phuong thuc diChoi(){ code}
	private String hoTen;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	private String ngaySinh;
	private String tuoi;
	
	public void diChoi() {
		System.out.println("Troi dep thi di choi");
	}
	

}
