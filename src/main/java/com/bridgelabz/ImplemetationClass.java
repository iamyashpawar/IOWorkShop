package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ImplemetationClass implements WritingMethods {


     static  final String filePath = "C:\\Users\\91963\\IdeaProjects\\AdressBookWorkshop\\src\\main\\java\\com\\bridgelabz\\Sample1.txt";
 //    static  final String filePath = "";
    @Override
    public void writeUpInFile(List<AddressBook> addressBookList) throws IOException {

        StringBuffer sb = new StringBuffer();

        addressBookList.stream().forEach(addressBook -> {
           String adrString= addressBook.toString().concat("/n");
           sb.append(adrString);
        });
        Files.write(Path.of(filePath),sb.toString().getBytes());

//    Files.write(Path.of())


    }

    @Override
    public void writeUpInJason(List<AddressBook> addressBooks) {

        //Reader reader = new Reader()


    }

    @Override
    public void writeUpInCSV(List<AddressBook> addressBooks) {



    }
}
