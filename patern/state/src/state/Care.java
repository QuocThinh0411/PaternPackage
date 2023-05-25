package state;
import java.util.ArrayList;

public class Care {
	private ArrayList<RecordState> recordStateList = new ArrayList<>();
    public void add(RecordState record) {
    	recordStateList.add(record);
    }
    
    public RecordState get(int index) {
        return recordStateList.get(index);
    }
}
