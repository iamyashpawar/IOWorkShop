package com.bridgelabz;

import java.io.IOException;
import java.util.List;

public interface WritingMethods {




    void writeUpInFile(List<AddressBook> addressBookLis) throws IOException;


    void writeUpInJason(List<AddressBook> addressBooks);


    void writeUpInCSV(List<AddressBook> addressBooks);
}
