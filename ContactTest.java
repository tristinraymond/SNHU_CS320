 package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Contact;

class ContactTest{


	@DisplayName("Test a valid Constructor")
	@Test
	public void testGoodConstructor() {
        String contactId = "1";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
        
		assertEquals(1, testContact.getContactID());
		assertEquals(firstName, testContact.getFirstName());
		assertEquals(lastName, testContact.getLastName());
		assertEquals(phoneNumber, testContact.getNumber());
		assertEquals(address, testContact.getAddress());
	}
	
	
	@DisplayName("Test an invalid Constructor")
	@Test
	public void testBadConstructor() {
        String contactId = "2";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1";
        String address = "123 E Street";       
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	
	@DisplayName("Test a valid FirstName")
	@Test
	public void testGoodSetFirst() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setFirstName("Test");        
        assertEquals("Test", testContact.getFirstName());
	}
	
	
	@DisplayName("Test an invalid null FirstName")
	@Test
	public void testBadSetFirst() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName(null);
        });
	}
	
	
	@DisplayName("Test an invalid length FirstName")
	@Test
	public void testLongSetFirst() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName("Tiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiim");
        });
	}
	
	
	@DisplayName("Test ID")
	@Test
	public void testGetID() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertEquals(3, testContact.getContactID());
	}
	
	
	@DisplayName("Test bad ID")
	@Test
	public void testBadGetID() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertNotEquals("3", testContact.getContactID());
	}
	
	
	@DisplayName("Test too long ID")
	@Test
	public void testlongGetID() {
        String contactId = "12345678910341213";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	
	@DisplayName("Test an invalid null LastName")
	@Test
	public void testBadSetLast() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName(null);
        });
	}
	
	
	@DisplayName("Test an invalid length LastName")
	@Test
	public void testLongSetLast() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName("LastName is wayyyyyyyyyyyy too long");
        });
	}
	

	@DisplayName("Test a valid LastName")
	@Test
	public void testGoodsetLast() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setLastName("Test");        
        assertEquals("Test", testContact.getLastName());
	}
	
	
	@DisplayName("Test an invalid null Number")
	@Test
	public void testBadSetPhone() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setNumber(null);
        });
        
	}
	
	
	@DisplayName("Test an invalid length Number")
	@Test
	public void testWrongLengthPhone() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setNumber("1");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setNumber("1234567893451112131415");
        });
	}

	@DisplayName("Test a valid length Number")
	@Test
	public void testGoodPhone() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setNumber("1987654321");        
        assertEquals("1987654321", testContact.getNumber());

	}
	

	@DisplayName("Test an invalid null Address")
	@Test
	public void testNullSetAddress() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress(null);
        });
        
	}
	
	
	@DisplayName("Test an invalid length Number")
	@Test
	public void testWrongLengthAddress() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress("12345678990980 Address Waaaaaaaaaay Toooooo Long For This Input");
        });
	}

	@DisplayName("Test a valid length Address")
	@Test
	public void testGoodAddress() {
        String contactId = "3";
      	String firstName = "Tim";
        String lastName = "Stewart";
        String phoneNumber = "1234567891";
        String address = "123 E Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setAddress("98754 Address");        
        assertEquals("98754 Address", testContact.getAddress());

	}
	
}