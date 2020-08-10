package maplestory;

public class User {
	private String NexonID;
	private String Password;
	private String UserName;
	private String ClassName;
	
	public String getNexonID() {
		return NexonID;
	}
	public void setNexonID(String nexonID) {
		NexonID = nexonID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	
	public User(String nexonID, String password) {
		super();
		NexonID = nexonID;
		Password = password;
	}
	
	
}
