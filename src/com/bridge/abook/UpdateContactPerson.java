package com.bridge.abook;
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateContactPerson {
    String firstName;
    String lastName;
    String address;
    String city;
    int zip;
    long phoneNumber;
    String emailId;

    public UpdateContactPerson() {

    }
    public static void addressBook(ArrayList<UpdateContactPerson> UpdateContactPerson) {
        for(int j=0;j<UpdateContactPerson.size();j++) {
            System.out.println("------------------------------------------------");
            System.out.println("First Name : " + UpdateContactPerson.get(j).firstName);
            System.out.println("Last Name : " + UpdateContactPerson.get(j).lastName);
            System.out.println("Address : " + UpdateContactPerson.get(j).address);
            System.out.println("City Name : " + UpdateContactPerson.get(j).city);
            System.out.println("Zip code : " + UpdateContactPerson.get(j).zip);
            System.out.println("Phone Number : " + UpdateContactPerson.get(j).phoneNumber);
            System.out.println("Email id : " + UpdateContactPerson.get(j).emailId);
            System.out.println("------------------------------------------------");
        }
    }

    public void updateData(String name, ArrayList<UpdateContactPerson> record) {
        for(int i=0;i<record.size();i++) {
            if (name.equals(record.get(i).firstName)) {
                record.remove(i);
                record.add(i, insertData());
            }
        }
        System.out.println("Record Update Successfully !");
    }
    public static UpdateContactPerson insertData() {

        UpdateContactPerson addressBookMain1= new UpdateContactPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name : ");
        addressBookMain1.firstName = sc.next();
        System.out.print("Enter the last name : ");
        addressBookMain1.lastName = sc.next();
        System.out.print("Enter the address : ");
        addressBookMain1.address = sc.next();
        System.out.print("Enter the city name : ");
        addressBookMain1.city = sc.next();
        System.out.print("Enter the zip code : ");
        addressBookMain1.zip = sc.nextInt();
        System.out.print("Enter the phone number : ");
        addressBookMain1.phoneNumber = sc.nextLong();
        System.out.print("Enter the email id : ");
        addressBookMain1.emailId = sc.next();
        UpdateContactPerson addBookMain1 = null;
        return addBookMain1;
    }
    public static void deleteRecord(String name, ArrayList<UpdateContactPerson> record) {
        if(record.size()>0) {
            for (int i = 0; i < record.size(); i++) {
                if (name.equals(record.get(i).firstName)) {
                    record.remove(i);
                }
                else System.out.println("There is no any person contact for "+name);
            }
        }
        else System.out.println("There is no any person address to delete");
        System.out.println("Record Delete Successfully !");
    }

    public static void updatedata(String name, ArrayList<UpdateContactPerson> record) {
    }
}
