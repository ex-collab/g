package model;

public class Users
{
	private String eid;
	private String fname;
	private String lname;
	private String doj;
	private String dept;
	
	public Users() {
		super();
	}
	
	
	public Users(String eid, String fname, String lname, String doj, String dept) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.doj = doj;
		this.dept = dept;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
