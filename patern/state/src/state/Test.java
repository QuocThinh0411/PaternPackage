package state;

public class Test {

	public static void main(String[] args) {
		 ThiSinh thiSinh = new ThiSinh();
	      Care care = new Care();
	      //tạo 1 list lưu danh sách trạng thái "care"
	      //T1 VO DICH
	      thiSinh.setSoTuoi("13");
	      care.add(thiSinh.luuTrangThaiTuoi());
	      thiSinh.setSoTuoi("14");
	      care.add(thiSinh.luuTrangThaiTuoi());
	      thiSinh.setSoTuoi("15");
	      care.add(thiSinh.luuTrangThaiTuoi());
	      thiSinh.setSoTuoi("16");
	      care.add(thiSinh.luuTrangThaiTuoi());
	      
	      System.out.print(care.get(2).toString());
	   
	}

}
