package edu.svit.sf04.training;

public class Student {
	private int id;
	private String Name;
	private String usn;
	private String Number;
	
	Student(){
		super();
	}
	Student(int id,String Name,String usn,String Number){
		this.id=id;
		this.Name=Name;
		this.usn=usn;
		this.Number=Number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	
	
}
