package com.javamasterclass.oops.inheritance;

public class Programmer extends Employee {

    private String[] programmingLanguages;

    public Programmer(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public Programmer(String name, int age, String address, String experience, String[] programmingLanguages) {
        super(name, age, address, experience);
        this.programmingLanguages = programmingLanguages;
    }

    //use of super
    public void writeSomeCode() {
        super.sayHi();
        System.out.println("programmer writing some code");
    }

    //use of override
    @Override
    public void sayHi() {
        var msg =
                """
                Hello My Name is %s
                I am a Java Programmer
                """.formatted(this.name);       //protected name field

        System.out.println(msg);

        String anotherMsg =
                String.format("i live in %s", this.getAddress());       //private field available through getter :> getter available through inheritance
        System.out.println(anotherMsg);

        String oneAnotherMsg =          //""" ___ """ USED TO FORMAT STRING IN WAY WE WRITE
                """                             
                I
                want
                to
                be
                best
                in
                %s
                """.formatted(this.programmingLanguages[1]);

        System.out.println(oneAnotherMsg);

    }
}
