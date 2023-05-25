package state;

public class ThiSinh {
	private String soTuoi;

	public String getSoTuoi() {
		return soTuoi;
	}

	public void setSoTuoi(String soTuoi) {
		this.soTuoi = soTuoi;
	}
	

    public RecordState luuTrangThaiTuoi() {
        return new RecordState(soTuoi);
    }
 
    public void layTuoiTuRecord(RecordState record) {
    	this.soTuoi = record.getSoTuoi();
    }
}
