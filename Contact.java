package main;

public class Contact{
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	
	
	private final boolean checkID(String contactID) {
		if(contactID == null || contactID.length() > 10) {
			return false;
		}
		return true;
	}

	

	private final boolean checkLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			return false;
		}
		return true;
	}

	

	private final boolean checkFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
			return false;
		}
		return true;
	}

	
	private final boolean checkNumber(String number) {
		if(number == null || number.length() != 10) {
			return false;
		}
		return true;
	}



	private final boolean checkAddress(String address) {
		if(address == null || address.length() > 30) {
			return false;
		}
		return true;
	}

	public Contact(String contactID, String firstName, String lastName, String number, String address) {
		if(!this.checkID(contactID)) {
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		if(!this.checkLastName(lastName)) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(!this.checkFirstName(firstName)) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(!this.checkNumber(number)) {
			throw new IllegalArgumentException("Invalid Number");
		}
		if(!this.checkAddress(address)) {
			throw new IllegalArgumentException("Invalid Address");
		}

		this.contactID = contactID;
		this.lastName = lastName;
		this.firstName = firstName;
		this.number = number;
		this.address = address;
	}

	public int getContactID() {
		return Integer.valueOf(contactID);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(!this.checkFirstName(firstName)) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(!this.checkLastName(lastName)) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.lastName = lastName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		if(!this.checkNumber(number)) {
			throw new IllegalArgumentException("Invalid Phone NUmber");
		}
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if(!this.checkAddress(address)) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.address = address;
	}
}