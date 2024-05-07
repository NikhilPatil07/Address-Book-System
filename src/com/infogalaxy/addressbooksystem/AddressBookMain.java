package com.infogalaxy.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain 
{
	Scanner scanner = new Scanner(System.in);
	Contact contact = new Contact();
	
	public void addContact()
	{
		System.out.println("Enter the First Name :");
		contact.setFirstName(scanner.next());
		System.out.println("Enter the Last Name :");
		contact.setLastName(scanner.next());
		System.out.println("Enter the Address :");
		contact.setAddress(scanner.next());
		System.out.println("Enter the City :");
		contact.setCity(scanner.next());
		System.out.println("Enter the State :");
		contact.setState(scanner.next());
		System.out.println("Enter the Zip Code :");
		contact.setZip(scanner.next());
		System.out.println("Enter the Phone No :");
		contact.setPhoneNo(scanner.next());
		System.out.println("Enter the Email :");
		contact.setEmail(scanner.next());
	}
	
	void displayContact()
	{
		if(contact == null)
		{
			System.out.println(" Contact is Not Available ");
		}
		else 
		{
		
		System.out.println(" First Name :"+contact.getFirstName());
		System.out.println(" Last Name :"+contact.getLastName());
		System.out.println(" Address :"+contact.getAddress());
		System.out.println(" City :"+contact.getCity());
		System.out.println(" State :"+contact.getState());
		System.out.println(" Zip Code :"+contact.getZip());
		System.out.println(" Phone No :"+contact.getPhoneNo());
		System.out.println(" Email :"+contact.getEmail());
		}
		
	}
	
	void editContact()
	{
		System.out.println(" Enter the First Name to Edit Contact ");
		String firstName = scanner.next();
		if(firstName.equals(contact.getFirstName()))
		{
			System.out.println(" Contact Found ");
			
			System.out.println("Enter the First Name :");
			contact.setFirstName(scanner.next());
			System.out.println("Enter the Last Name :");
			contact.setLastName(scanner.next());
			System.out.println("Enter the Address :");
			contact.setAddress(scanner.next());
			System.out.println("Enter the City :");
			contact.setCity(scanner.next());
			System.out.println("Enter the State :");
			contact.setState(scanner.next());
			System.out.println("Enter the Zip Code :");
			contact.setZip(scanner.next());
			System.out.println("Enter the Phone No :");
			contact.setPhoneNo(scanner.next());
			System.out.println("Enter the Email :");
			contact.setEmail(scanner.next());
		}
		else 
		{
			System.out.println(" Given Name of Contact is Not Found ");
		}
	}
	
	public void deleteContact()
	{
		System.out.println(" Enter the First Name to Delete the Contact : ");
		String firstNameString = scanner.next();
		if(firstNameString.equals(contact.getFirstName()))
		{
			System.out.println(" Contact is Found ");
			contact = null;
		}else 
		{
			System.out.println(" Given Name of Contact is Not Found ");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(" Welcome to Address Book System ");
		AddressBookMain addressBookMain = new AddressBookMain();
		addressBookMain.addContact();
		addressBookMain.displayContact();
		addressBookMain.editContact();
		addressBookMain.displayContact();
		addressBookMain.deleteContact();
		addressBookMain.displayContact();
	}
}
