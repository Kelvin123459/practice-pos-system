package users;

import abstracts.User;

public class Employee extends User{
	private int userID;
	private int employeeID;
	public String userName;
	public String userLastname;
	public int age;
	public int rank;
	
	public Employee() {
		
	}
	
	public Employee(int userID, int employeeID, String userName, String userLastname, int age, int rank) {
		super();
		this.userID = userID;
		this.employeeID = employeeID;
		this.userName = userName;
		this.userLastname = userLastname;
		this.age = age;
		this.rank = rank;
	}
}
