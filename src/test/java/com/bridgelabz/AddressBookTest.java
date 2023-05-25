package com.bridgelabz;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddressBookTest {


    @Test

    public void givenContactAddintoAddressBook()  {

        Contact contact1 = new Contact("Yash Pawar", "Nashik","Maharashtra");
        Contact contact2 = new Contact("Swapnil Deshmukh", "Delhi","Delhi");
        Contact contact3 = new Contact("Ankita Patil", "Surat","Gujrat");



     //  List<AddressBook> addressBookList = new ArrayList<>();
//        AddressBook addressBook1 = new AddressBook(List<Contact> addressBooklist);
//        addressBookList.add(contact1);
//        addressBookList.add(contact2);
//        addressBookList.add(contact3);


//        AddressBook addressBook1 = new AddressBook();
//        addressBook1.contactList.add(contact1);
//        addressBook1.contactList.add(contact2);
//        addressBook1.contactList.add(contact3);
//
//      TextFileWrite o1 = new TextFileWrite();
//
//      o1.textwriteup();


        List<AddressBook> addressBooks = new ArrayList<>();

        AddressBook addressBook1 = new AddressBook();
        AddressBook addressBook2 = new AddressBook();


        addressBook1.contactList.add(contact1);
        addressBook1.contactList.add(contact2);
        addressBook2.contactList.add(contact3);

        addressBooks.add(addressBook1);
        addressBooks.add(addressBook2);


        WritingMethods w1 = new ImplemetationClass();


        try {
            w1.writeUpInFile(addressBooks);
        } catch (IOException e) {
            System.out.println("Handled");
        }

        w1.writeUpInJason(addressBooks);


        w1.writeUpInCSV(addressBooks);

    }
}
