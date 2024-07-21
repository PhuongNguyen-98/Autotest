package meomeo1;

public abstract class DongVat {
	private String loai;
	private String ten;
	private String kichThuoc;
	public String getKichThuoc() {
		return kichThuoc;
	}
	public void setKichThuoc(String kichThuoc) {
		this.kichThuoc = kichThuoc;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public abstract  void cachDiChuyen();
	public void getInfor() {
		System.out.println("Ten: "+this.getTen()+", loai: "+this.getLoai()+", kich thuoc:"+this.getKichThuoc());
	}
	

}
