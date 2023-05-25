
public class Test {
	public static void main(String[] args) {
		System.out.println("Chua co gi");
		Tiktoker tiktoker1 = new Tiktoker();
		tiktoker1.setName("Thinh1");
		Follower1 fl1 = new Follower1("Anh hung xa dieu");
		Follower2 fl2 = new Follower2("Amee");
		Follower3 fl3 = new Follower3("Son Tung");
		Tiktoker tiktoker2 = new Tiktoker();
		tiktoker2.setName("Thinh2");
		
		
		System.out.println("Sau khi thuc hien hanh dong up status");
		
		fl1.flow(tiktoker1);
		fl2.flow(tiktoker1);
		fl3.flow(tiktoker2);
		
		tiktoker1.upStatus();
		tiktoker2.upStatus();
			
	}


}
