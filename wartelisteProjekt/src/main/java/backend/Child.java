package backend;

public class Child {
	
	private String name;
	private String surname;
	private String note;
	//private ArrayList<Child> siblings;
	//private Date birthday;
	private String address;
	private String gender;
	private String group;
	
	
	
	public Child( String name, String surname, String note, String address, String gender, String group){
	this.setName(name);
	this.setSurname(surname);
	this.setNote(note);
	//this.setSiblings(siblings);
	//this.setBirthday(birthday);
	this.setAddress(address);
	this.setGender(gender);
	this.setGroup(group);
	
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getSurname() {
		return surname;
	}




	public void setSurname(String surname) {
		this.surname = surname;
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
