package meomeo1;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chim chim1 = new Chim();
		chim1.setLoai("Chim sau");
		chim1.setTen("Chim se");
		chim1.setKichThuoc("nho");
		chim1.getInfor();
		chim1.cachDiChuyen();
		
		Ca ca1 = new Ca();
		ca1.setLoai("Ca Voi");
		ca1.setTen("Ca Voi Xanh");
		ca1.setKichThuoc("To");
		ca1.getInfor();
		ca1.cachDiChuyen();
		
		Thu thu1 = new Thu();
		thu1.setLoai("Thu co tui");
		thu1.setTen("Chuot tui");
		thu1.setKichThuoc("Trung binh");
		thu1.getInfor();
		thu1.cachDiChuyen();

	}

}
