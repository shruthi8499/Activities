package com.functional;
import java.util.ArrayList;
public class Collection {
	public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Alex", "abc@gmail.com"));
        personList.add(new Person("Sam", "sam@gmail.com"));
        personList.add(new Person("Erric", "erric@gmail.com"));
        personList.forEach(Collection::printPersonInfo);
    }
    public static void printPersonInfo(Person person) {
        System.out.println("Person name: " + person.personName + ", Email: " + person.emailId);
}
}
	    
