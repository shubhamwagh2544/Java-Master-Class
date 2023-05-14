package com.javamasterclass.medium_articles;

import org.junit.jupiter.api.Test;
import java.util.*;

public class BetterJavaCodeTest {

    public static void main(String[] args) {
        BetterJavaCodeTest test = new BetterJavaCodeTest();

        // calling equals on known object
        test.avoidingNullPointerOnEqualsMethod();

        // using entryset to loop over hashmap
        test.usingEntrySetToIterateOverHashmap();

        // code to interface : can extend implementation
        test.codeToInterface();

        // using iterator to traverse list
        test.usingIteratorToTraverseList();
    }

    @Test
    public void usingIteratorToTraverseList() {
        List<String> list = new ArrayList<>(
                Arrays.asList(
                        "Shubham",
                        "Ramesh",
                        "Wagh"
                ));

        // iteration 1
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }

        // iteration 2
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public void codeToInterfaceHelper(List list) {
        System.out.println(list);
    }

    public void codeToInterfaceHelperAnother(Collection collection) {
        System.out.println(collection);
    }

    @Test
    public void codeToInterface() {
        // 1 implementation
        ArrayList<String> arrayList = new ArrayList<>(
                Arrays.asList(
                        "Shubham",
                        "Ramesh",
                        "Wagh"
                ));
        codeToInterfaceHelper(arrayList);
        codeToInterfaceHelperAnother(arrayList);

        // 2 implementation
        Vector<String> vector = new Vector<>(
                Arrays.asList(
                        "Shubham",
                        "Ramesh",
                        "Wagh"
                ));
        codeToInterfaceHelper(vector);
        codeToInterfaceHelperAnother(vector);

        // 3 implementation
        Stack<String> stack = new Stack<>();
        stack.push("Shubham");
        stack.push("Ramesh");
        stack.push("Wagh");
        codeToInterfaceHelper(stack);
        codeToInterfaceHelperAnother(stack);
    }

    @Test
    public void usingEntrySetToIterateOverHashmap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "shubham");
        map.put(2, "ramesh");
        map.put(3, "wagh");

        // to iterate over keys in hashmap : getting key : O(n) traversal
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " ");
        }

        // to iterate over values in hashmap : getting values : O(n) traversal
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value + " ");
        }

        // use Entry Object instead
        // getting value from object is O(1)
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }

    }

    @Test
    public void avoidingNullPointerOnEqualsMethod() {
        String s1 = "shubham";
        String s2 = null;
        System.out.println(s2.equals(s1));          // will throw NPE

        System.out.println(s1.equals(s2));          // instead invoke equals on known object
        // even if other is null, it won't throw NPE
    }

}
