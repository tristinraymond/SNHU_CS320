package main;
import java.net.IDN;
import java.util.ArrayList;
import java.util.List;
import main.Contact;

public class ContactService {
	int currID = 0;

	public static List<Contact> contactList = new ArrayList<Contact>();

	

	public void addContact(String firstName, String lastName, String number, String address) {
		String stringID = Integer.toString(currID);
		Contact newContact = new Contact(stringID, firstName, lastName, number, address);
		contactList.add(newContact.getContactID(), newContact);

		++currID;
	}

	

	public void deleteContact(String ID) {
		int intID = Integer.valueOf(ID);

		for(int i = 0; i < ContactService.contactList.size(); i++) {
			if(ContactService.contactList.get(i).getContactID() == intID) {
				contactList.remove(i);
			}
		}
	}

	

	public void editFirstName(String contactID, String firstName) {
		for(Contact iter: contactList) {
			if(iter.getContactID()== Integer.valueOf(contactID)) {
				iter.setFirstName(firstName);
			}
		}
	}

	

	public void editLastName(String contactID, String lastName) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setLastName(lastName);
			}
		}
	}

	public void editNumber(String contactID, String number) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setNumber(number);
			}
		}
	}

	public void editAddress(String contactID, String address) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setAddress(address);
			}
		}
	}

}