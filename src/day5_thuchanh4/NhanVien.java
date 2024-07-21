package day5_thuchanh4;

public class NhanVien {
	
	public String hoTen;
	public String maNV;
	private String soDT;
	private String phongBan;
	public int maPhongBan;

	
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(int maPhongBan) {
		switch (maPhongBan) {
		case 1:
			this.phongBan = "DEV";
			break;
			
		case 2:
			this.phongBan = "TEST";
			break;
			
		case 3:
			this.phongBan = "BA";
			break;

		default:
			break;
		}
		this.maPhongBan = maPhongBan;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	
	public void getInfor() {
		System.out.println("Tên NV: "+this.hoTen+", Mã NV: "+ this.maNV+ ", Phòng ban: "+ this.phongBan + ", Số ĐT: "+this.getSoDT());
	}
	

}
