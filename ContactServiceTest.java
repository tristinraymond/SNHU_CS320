package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.ContactService;

class ContactServiceTest {
	
	
	
	@AfterEach
	void tearDown() throws Exception {
		ContactService.contactList.clear();
	}

	
	@DisplayName("Test addContact")
	@Test
	void testAddContact() {

		String firstName = "Tim";
		String lastName = "Stewart";
		String phoneNumber = "1234567891";
		String address = "123 E Street";

		ContactService test = new ContactService();

		assertTrue(ContactService.contactList.isEmpty());

		test.addContact(firstName, lastName, phoneNumber, address);

		assertFalse(ContactService.contactList.isEmpty());
		assertEquals(0, ContactService.contactList.get(0).getContactID());
		assertEquals(firstName, ContactService.contactList.get(0).getFirstName());
		assertEquals(lastName, ContactService.contactList.get(0).getLastName());
		assertEquals(phoneNumber, ContactService.contactList.get(0).getNumber());
		assertEquals(address, ContactService.contactList.get(0).getAddress());

	}

	@DisplayName("Test deleteContact")			  
	@Test void testDeleteContact() {
				  
		String firstName = "Tim";
		String lastName = "Stewart";
		String phoneNumber = "1234567891";
		String address = "123 E Street";
		boolean testBool = false;
		  
		ContactService test = new ContactService();
		  
		assertTrue(ContactService.contactList.isEmpty());
		 
		test.addContact(firstName, lastName, phoneNumber, address);//object at ID 0
		test.addContact(firstName, lastName, phoneNumber, address);//object at ID 1
		test.addContact(firstName, lastName, phoneNumber, address);//object at ID 2
		  
		assertEquals(3,ContactService.contactList.size());
		  
		test.deleteContact("1");
		  
		assertEquals(2,ContactService.contactList.size());
		 
		//loop through to look for ID
		for(int i = 0; i < ContactService.contactList.size(); i++) {
			if(ContactService.contactList.get(i).getContactID() == 1) {
				testBool = true;
			}
		}		
		assertFalse(testBool);				 
	}
	
	@DisplayName("Test editing a phone number")
	@Test
	void testEditPhone() {
		
		String firstName = "Tim";
		String lastName = "Stewart";
		String phoneNumber = "1234567891";
		String address = "123 E Street";
		  
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(phoneNumber, ContactService.contactList.get(0).getNumber());
		
		test.editNumber("0", "1987654321");
		assertEquals("1987654321", ContactService.contactList.get(0).getNumber());
	}

	@DisplayName("Test editing a last name")
	@Test
	void testEditLast() {
		
		String firstName = "Tim";
		String lastName = "Stewart";
		String phoneNumber = "1234567891";
		String address = "123 E Street";
		  
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(lastName, ContactService.contactList.get(0).getLastName());
		
		test.editLastName("0", "Test_Name");
		assertEquals("Test_Name", ContactService.contactList.get(0).getLastName());
	}
	
	@DisplayName("Test editing a first name")
	@Test
	void testEditFirst() {
		
		String firstName = "Tim";
		String lastName = "Stewart";
		String phoneNumber = "1234567891";
		String address = "123 E Street";

		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(firstName, ContactService.contactList.get(0).getFirstName());
		
		test.editFirstName("0", "Test_First");
		assertEquals("Test_First", ContactService.contactList.get(0).getFirstName());
	}
	
	@DisplayName("Test editing an address")
	@Test
	void testEditAddress() {
		
		String firstName = "Tim";
		String lastName = "Stewart";
		String phoneNumber = "1234567891";
		String address = "123 E Street";

		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(address, ContactService.contactList.get(0).getAddress());
		
		test.editAddress("0", "Test_Address");
		assertEquals("Test_Address", ContactService.contactList.get(0).getAddress());
	}
}