import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {


		MayBay1 mayBay1 = new MayBay1();
		MayBay2 mayBay2 = new MayBay2();
		
		mayBay1.setName("B52");
		mayBay2.setName("B53");
		
		TramKhongLuu tkl1 = new TramKhongLuu();
		
		tkl1.addMayBay(mayBay1);
		tkl1.addMayBay(mayBay2);
		
		System.out.print("///");
		mayBay1.nhanTin(mayBay2,"Chao anh may bay B53");
		System.out.print("///");
		
		tkl1.thongBao("XIN CHAO CHUNG");
	}

}
