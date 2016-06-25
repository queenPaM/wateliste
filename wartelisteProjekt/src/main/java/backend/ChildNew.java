package backend;

public class ChildNew {
	private String kidname;
	private String kidsurname;
	private String note;
	//private ArrayList<Child> siblings;
	//private Date birthday;
	private String address;
	private String gender;
	private String group;
	
	
	
	public ChildNew( String kidname, String kidsurname, String note, String address, String gender, String group){
	this.setName(kidname);
	this.setSurname(kidsurname);
	this.setNote(note);
	//this.setSiblings(siblings);
	//this.setBirthday(birthday);
	this.setAddress(address);
	this.setGender(gender);
	this.setGroup(group);
	
	}




	public String getName() {
		return kidname;
	}




	public void setName(String kidname) {
		this.kidname = kidname;
	}




	public String getSurname() {
		return kidsurname;
	}




	public void setSurname(String kidsurname) {
		this.kidsurname = kidsurname;
	}




	public String getNote() {
		return note;
	}




	public void setNote(String note) {
		this.note = note;
	}







	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getGroup() {
		return group;
	}




	public void setGroup(String group) {
		this.group = group;
	}
}
