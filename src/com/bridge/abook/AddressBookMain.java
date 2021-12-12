package com.bridge.abook;
import java.util.ArrayList;
import java.util.Scanner;


public class AddressBookMain {

    //Declare Variable
    String firstName;
    String lastName;
    String address;
    String city;
    int zip;
    long phoneNumber;
    String emailId;

    //Take Input Value
    private void insertData() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first name : ");
        this.firstName=sc.next();
        System.out.print("Enter the last name : ");
        this.lastName=sc.next();
        System.out.print("Enter the address : ");
        this.address=sc.next();
        System.out.print("Enter the city name : ");
        this.city=sc.next();
        System.out.print("Enter the zip code : ");
        this.zip=sc.nextInt();
        System.out.print("Enter the phone number : ");
        this.phoneNumber=sc.nextLong();
        System.out.print("Enter the email id : ");
        this.emailId=sc.next();
    }

    //Show the Values
    private void fetchAddressBook() {
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name : "+lastName);
        System.out.println("Address : "+address);
        System.out.println("City Name : "+city);
        System.out.println("Zip code : "+zip);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Email Id : "+emailId);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        ArrayList<AddressBookMain> record=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        AddressBookMain addBookMain1=new AddressBookMain();
        int status=1;
        while(status==1) {
            addBookMain1.insertData();
            record.add(addBookMain1);

            System.out.print("you want to add more address press 1 or 0 for exit ): ");
            status = sc.nextInt();
            if (status == 0) break;
        }
        for(int i=0;i<record.size();i++){
            showAllRecords(record.get(i));
        }
    }
    private static void showAllRecords(AddressBookMain addressBookMain) {
        addressBookMain.fetchAddressBook();
    }

}
