package com.bridgelabz;

public class Contact {

    private String personName;
    private String nameofCity;

    private  String nameofState;
    public Contact(String personName, String nameofCity, String nameofState) {

        this.personName = personName;
        this.nameofCity = nameofCity;
        this.nameofState = nameofState;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "personName='" + personName + '\'' +
                ", nameofCity='" + nameofCity + '\'' +
                ", nameofState='" + nameofState + '\'' +
                '}';
    }
}
