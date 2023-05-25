import java.util.ArrayList;

public class TramKhongLuu {
	protected ArrayList<MayBay> danhSachMayBay = new ArrayList<>();

	public ArrayList<MayBay> getDanhSachMayBay() {
		return danhSachMayBay;
	}
	protected void addMayBay(MayBay mb) {
		getDanhSachMayBay().add(mb);
		mb.setTkl(this);

	}
	public void setDanhSachMayBay(ArrayList<MayBay> danhSachMayBay) {
		this.danhSachMayBay = danhSachMayBay;
	}
	protected void thongBaoRieng(MayBay mbsend,MayBay mbreceive, String mess) {
		mbreceive.addThu(mess);
		System.out.println(mbsend.getName()+" gui toi thong bao toi may bay "+mbreceive.getName()+" co noi dung sau "+mbreceive.getHomThu());
		
	}
	protected void thongBao(String mess) {
		System.out.println(mess);
		for (MayBay mayBay : danhSachMayBay) {
			mayBay.addThu(mess);
			System.out.println(mayBay.getHomThu());
			
		}
		
		
	}
	
}
