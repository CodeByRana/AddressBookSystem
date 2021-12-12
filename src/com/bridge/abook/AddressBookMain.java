package com.bridge.abook;
import java.util.ArrayList;
import java.util.Scanner;


public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        UpdateContactPerson contactPerson = new UpdateContactPerson();

        ArrayList<UpdateContactPerson> record = new ArrayList<>();
        String name;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int status = 1;
        while (flag) {
            System.out.print("1 - Add more contact \n2 - Edit Contact \n3 - Delete person Contact \n4 - Show AddressBook "+
                    "\n0 -  for exit \nEnter your Choice.....");
            status = sc.nextInt();

            switch (status) {
                case 1:
                    record.add(UpdateContactPerson.insertData());
                    break;
                case 2:
                    System.out.println("Enter first name and if you want to update record");
                    name = sc.next();
                    UpdateContactPerson.updatedata(name, record);
                    break;
                case 3:
                    System.out.println("Enter first name and if you want to delete record");
                    name = sc.next();
                    UpdateContactPerson.deleteRecord(name,record);
                    break;
                case 4:
                    System.out.println("Side of record : " + record.size());
                    UpdateContactPerson.addressBook(record);
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }

    }
}
