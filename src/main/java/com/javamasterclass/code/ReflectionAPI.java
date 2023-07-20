package com.javamasterclass.code;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
        Reflection API :
        to understand blueprint of class
        - way to inspect or modify classes, methods, fields and other components of class at runtime.
        - i.e. access information about class at runtime (which may not be present at compile time)

        pros :
        - helpful to debug class / know about / blueprint of class

        Cons :
        - not thread safe
        - type safety exceptions
        - performance overhead compared to direct method call/field access
        - security risk - private members are accessible/modifiable
 */
class Student {
    private String name;
    private final int id;

    public Student(String name) {
        id = 1;
        this.name = name;
    }

    private void whatIsName() {
        System.out.println("Name is : " + name);
    }

    public void sayName() {
        System.out.println("Saying Name : " + name);
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}

public class ReflectionAPI {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Student student = new Student("Shubham Wagh");

        //Class
        Class<?> studentClass = Student.class;          //We can explicitly give Student in <> or unbounded wildcard
        String className = studentClass.getName();
        System.out.println(className + "\n");

        //creating object
        //Object object = studentClass.newInstance();

        //fields
        Field[] fields = studentClass.getDeclaredFields();

        for (Field field : fields) {
            //No object is required for reading field metadata/information
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getDeclaringClass());

            //Object is required to get/set field value
            field.setAccessible(true);
            Object o = field.get(student);                  //cannot access private method until setAccessible(true)
        }

        //methods
        Method[] methods = studentClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(method.getDeclaringClass());
            System.out.println(method.getGenericReturnType());
            System.out.println(method.getParameterCount());

            //Object is required to invoke method
            method.setAccessible(true);
            method.invoke(student);                     //cannot access private method until setAccessible(true)
        }
    }
}
