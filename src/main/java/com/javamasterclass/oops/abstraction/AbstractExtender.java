package com.javamasterclass.oops.abstraction;

public class AbstractExtender extends AbstractClass {
    private String firstName;                   // own private field
    public AbstractExtender(String abstractName, String firstName) {  // abstract class fields initialised through subclass constructor
        super(abstractName);
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
//    @Override
//    public void sayHi() {               // overridden method from abstract parent into subclass with diff logic
//        System.out.println("Inside Abstract Extender");
//    }

    @Override
    public void sayHello() {                    // will have to override the abstract method with no-body
        System.out.println("Inside Abstract Extender");
    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractExtender("Shubham Wagh", "Shubham");
        System.out.println(abstractClass.getAbstractName());
        abstractClass.sayHi();          // if not overridden in subclass, this will call parent method
        abstractClass.sayHello();       // this will always call subclass method only : bcz its abstract in parent

        AbstractExtender abstractExtender = new AbstractExtender("Ramesh Wagh", "Ramesh");
        System.out.println(abstractExtender.firstName);
        abstractExtender.sayHi();       // parent class method available to subclass through inheritance
        abstractExtender.sayHello();
    }

}
