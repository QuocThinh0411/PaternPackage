import java.lang.reflect.Array;
import java.util.ArrayList;

public class Follower {
	private String name;

	public Follower(String name) {
		super();
		this.name = name;
	}

	private ArrayList<Tiktoker> followed = new ArrayList<Tiktoker>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFollowed(ArrayList<Tiktoker> followed) {
		this.followed = followed;
	}

	public ArrayList<Tiktoker> getFollowed() {
		return followed;
	}


	public static boolean isReceive() {
		return true;
	}

	
	public Follower(String name, ArrayList<Tiktoker> followed) {
		super();
		this.name = name;
		this.followed = followed;
	}

	protected void notiReceiveMessage(Tiktoker tiktoker) {

			System.out.println(this.getName() + " đa nhan status tu tiktoker co ten: " + tiktoker.getName());

	}

	protected void flow(Tiktoker tiktoker) {

		this.getFollowed().add(tiktoker);
		tiktoker.addFllower(this);

	}

}
