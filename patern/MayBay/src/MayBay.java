import java.util.ArrayList;

public class MayBay {

	protected ArrayList<String> homThu = new ArrayList<>();
	protected TramKhongLuu tkl;
	public TramKhongLuu getTkl() {
		return tkl;
	}

	protected String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	protected void nhanTin(MayBay mb,String mess) {
		tkl.thongBaoRieng(this,mb,mess);
	}
	public ArrayList<String> getHomThu() {
		return homThu;
	}
	public void setHomThu(ArrayList<String> homThu) {
		this.homThu = homThu;
	}
	public void addThu(String mess) {
		getHomThu().add(mess);
	}
	public void setTkl(TramKhongLuu tkl2) {
		this.tkl = tkl2;
	}
}
