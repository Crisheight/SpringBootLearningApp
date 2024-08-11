package com.crosa.learning;


public class FirstClass {

    private String myString;

    public FirstClass(String myString) {
        this.myString = myString;
    }

    public String sayHello() {
        return "Hello from the FirstClass ==> myString = " + myString + "\n";
    }

}
