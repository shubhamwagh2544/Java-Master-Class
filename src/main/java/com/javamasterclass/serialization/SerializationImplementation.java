package com.javamasterclass.serialization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@ToString
class Student implements Serializable {
    private String name;
    private Integer age;
    private transient LocalDateTime dateOfBirth;
}

/*
        Serialization : [Persistence of object state]
        - way to convert object into byte stream, to store in db/disc, transmit over network, save/persist to file.

        Deserialization :
        - way to convert byte stream into object [reconstruct object from its serialized form]
        
        How :
        implementing => Serializable(marker interface) OR Externalizable(which extends Serializable)

        Serializable : default serialization logic/process
        Externalizable : custom serialization logic (more control over serialization process)

        transient => hides/excludes the attribute from serialization process
        dateOfBirth will be null in deserialization state => since it was not passed for serialization
*/

public class SerializationImplementation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("src/main/java/com/javamasterclass/serialization/serializable_file.txt");

        //serialization
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        //object serialized into byte stream and saved to file.txt
        Student student = new Student("Shubham Wagh", 25, LocalDateTime.now());
        System.out.println(student);                            //before serializing object
        objectOutputStream.writeObject(student);

        //deserialization
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        //byte stream deserialized into object
        Student student1 =(Student) objectInputStream.readObject();
        System.out.println(student1);                           //after serializing object

        fileInputStream.close();
        fileOutputStream.close();

        objectInputStream.close();
        objectOutputStream.close();

    }
}
