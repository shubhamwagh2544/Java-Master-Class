package com.javamasterclass.code;

import java.util.HashMap;
import java.util.Hashtable;

class HashMapEx {
    private static HashMap<Integer, String> hashMap;            //non-synchronised (not thread-safe) -> faster
    public HashMapEx() {
        hashMap = new HashMap<>();
    }

    public HashMap<Integer, String> getHashMap() {
        return hashMap;
    }

    public void addKeyValue(Integer key, String value) {        //allows one null key and multiple null values
        hashMap.put(key, value);
    }
    public String getValue(Integer key) {
        return hashMap.get(key);
    }
}

class HashTableEx {
    private static Hashtable<Integer, String> hashtable;        //synchronised (thread-safe) -> slower
    public HashTableEx() {
        hashtable = new Hashtable<>();
    }

    public Hashtable<Integer, String> getHashtable() {
        return hashtable;
    }

    public void addKeyValue(Integer key, String value) {        //do not allow any null key or value - else NPE
        hashtable.put(key, value);
    }
    public String getValue(Integer key) {
        return hashtable.get(key);
    }
}


public class HashMapVsHashTable {
    public static void main(String[] args) {
        HashMapEx hashMapEx = new HashMapEx();
        hashMapEx.addKeyValue(1, "shubham");
        hashMapEx.addKeyValue(2, null);
        hashMapEx.addKeyValue(3, null);
        hashMapEx.addKeyValue(null, null);          //only one null key ( as keys are unique -> get updated with new value )
        hashMapEx.addKeyValue(null, "wagh");        //null key gets updated with new value

        System.out.println(hashMapEx.getHashMap());

        HashTableEx hashTableEx = new HashTableEx();
        hashTableEx.addKeyValue(1, "shubham");
        hashTableEx.addKeyValue(2, null);           //will throw NPE
        hashTableEx.addKeyValue(null, null);        //will throw NPE

        System.out.println(hashTableEx);
    }
}
