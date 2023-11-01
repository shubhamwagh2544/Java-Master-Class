package com.javamasterclass.collections.sets;

import java.util.EnumSet;
import java.util.Iterator;

/*
        - specialized implementation of Set, mainly used with enum types.
        - elements must come from a single enum type
        - null elements are not permitted else NPE
        - not synchronized collection.
 */

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetImplementation {
    public static void main(String[] args) {
        EnumSet<Day> dayEnumSet = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.THURSDAY);

        //add
        dayEnumSet.add(Day.FRIDAY);

        //remove
        dayEnumSet.remove(Day.MONDAY);

        //iterate : 1
        for (Day day : dayEnumSet) {
            System.out.println(day);
        }

        //iterate : 2
        Iterator<Day> iterator = dayEnumSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //null
        dayEnumSet.add(null);           //Null Pointer Exception
    }
}
