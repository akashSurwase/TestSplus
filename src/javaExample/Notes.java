package javaExample;

public class Notes {
	
	private int id;
	private String note;	
	private int num;

	
	@Override
	public String toString() {
		return "Notes [id=" + id + ", note=" + note + ", num=" + num + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Notes(int id, String note, int num) {
		super();
		this.id = id;
		this.note = note;
		this.num = num;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

}
