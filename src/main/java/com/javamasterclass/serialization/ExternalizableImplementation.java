package com.javamasterclass.serialization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@ToString
class Teacher implements Externalizable {
    private String name;
    private Integer age;
    private transient LocalDateTime dateOfBirth;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        String name = (String) in.readObject();
        Integer age = in.readInt();
    }
}

/*
        Externalization :
        Serialization but in more controlled/customizable way

        Externalizable interface
        - writeExternal() => for serializing
        - readExternal() => for deserializing

        transient => hides/excludes the attribute from serialization process
        dateOfBirth will be null in deserialization state => since it was not passed for serialization
 */

public class ExternalizableImplementation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("src/main/java/com/javamasterclass/serialization/externalizable_file.txt");

        //serialization
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        //object serialized into byte stream and saved to file.txt
        Teacher teacher = new Teacher("Shubham Wagh", 25, LocalDateTime.now());
        System.out.println(teacher);                            //before serializing object
        objectOutputStream.writeObject(teacher);

        //deserialization
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        //byte stream deserialized into object
        Teacher teacher1 =(Teacher) objectInputStream.readObject();
        System.out.println(teacher1);                           //after serializing object

        fileInputStream.close();
        fileOutputStream.close();

        objectInputStream.close();
        objectOutputStream.close();
    }
}
