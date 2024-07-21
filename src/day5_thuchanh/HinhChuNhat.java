package day5_thuchanh;

public class HinhChuNhat extends HinhHoc {
	public int chieuDai;
	public int chieuRong;

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return chieuDai * chieuRong;
	}

}
