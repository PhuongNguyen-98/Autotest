package day5_inherritance;

public class Giaovien extends Nguoi {
	// thuoc tinh mo rong: maGV, soNamKN
		// Override diChoi()
		// mo rong : diDay()
	private String maGV;
	private String soNamKN;
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public String getSoNamKN() {
		return soNamKN;
	}
	public void setSoNamKN(String soNamKN) {
		this.soNamKN = soNamKN;
	}
	
	@Override
	public void diChoi()
	{
		System.out.println("Day het bai thi di choi");
	}
	
	public void diDay() 
	{
		System.out.println("Day 5 ngay mot tuan");
	}
	
}
