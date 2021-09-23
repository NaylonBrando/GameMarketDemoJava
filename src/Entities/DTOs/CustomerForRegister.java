package Entities.DTOs;

public class CustomerForRegister {
	
	public String userName;
	public String password;
	public String email;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	public String nationalityId;
	
	public CustomerForRegister(String userName, String password, String email, String firstName, String lastName, int dateOfBirth,
			String nationalityId) {
		this.userName = userName;
		this.password = password;
		this.email=email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

}
