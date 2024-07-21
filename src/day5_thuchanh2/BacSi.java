package day5_thuchanh2;

public class BacSi {
	public  double tinhLuong( int  luongCoBan, double heSoLuong) 
	{
		return luongCoBan*heSoLuong;
	}
	
	public  double tinhLuong( int  luongCoBan, double heSoLuong, double soNamKN) 
	{
		return luongCoBan*heSoLuong*soNamKN;
	}
	
	public  double tinhLuong( int  luongCoBan, double heSoLuong, double soNamKN, int loai) 
	{
		double heSoLoai;
		switch (loai) {
		case 1:
			heSoLoai = 0.2;
			break;
		case 2:
			heSoLoai = 0.45;
			break;
		default:
			heSoLoai = 0;
			break;
		}
		return luongCoBan*heSoLuong*soNamKN*heSoLoai;
	}

}
