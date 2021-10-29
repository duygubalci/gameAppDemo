package gameAppDemo.Entities;
//import gameAppDemo.Entities.Player;

public class Player{
	String nationalityId;
	String firstName;
	String lastName;
	int dateOfBirth;
	String sex;
	
	public Player(){
		
	}
	
	public Player(String nationalityId, String firstName, String lastName, int dateOfBirth) {
		super();
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
