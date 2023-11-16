package com.javamasterclass.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MutableInsideImmutable {     // final to prevent behavior change
    private List<String> list;                  //mutable object field

    public MutableInsideImmutable(List<String> list) {
        this.list = new ArrayList<>(list);
    }

    //no setters

    public List<String> getList() {
        return Collections.unmodifiableList(list);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();      // list is mutable
        list.add("Shubham");
        list.add("Ramesh");
        list.add("Wagh");

        MutableInsideImmutable immutable = new MutableInsideImmutable(list);    //object is immutable

        //mutable
        list.add("Testing Mutability");

        //immutable : UnSupportedOperationException
        immutable.getList().add("Testing Immutability");        //UnSupportedOperation Exception
    }
}
