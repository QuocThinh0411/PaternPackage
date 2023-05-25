import java.util.ArrayList;

public class Tiktoker {
	protected ArrayList<Follower> followed = new ArrayList<Follower>();
private String name;
	boolean isUp = false;

	public ArrayList<Follower> getFollowed() {
		return followed;
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFollowed(ArrayList<Follower> followed) {
		followed = followed;
	}
	public void addFllower(Follower follow) {
	 this.getFollowed().add(follow);	
	}

	public void setUp(boolean isUp) {
		this.isUp = isUp;
	}

	public boolean isUp() {
		return isUp;
	}

	public void upStatus() {

		for (Follower follower : followed) {
		
			follower.notiReceiveMessage(this);
		}
	}
}
