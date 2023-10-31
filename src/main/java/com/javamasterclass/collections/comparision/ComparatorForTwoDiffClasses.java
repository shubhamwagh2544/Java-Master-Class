package com.javamasterclass.collections.comparision;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
class Man {
    private int id;
    private String name;
}

@Data
@AllArgsConstructor
class Woman {
    private int id;
    private String name;
}

class IdComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Man man1 && o2 instanceof  Man man2) {
            return Integer.compare(man1.getId(), man2.getId());
        }
        else if (o1 instanceof Woman woman1 && o2 instanceof Woman woman2) {
            return Integer.compare(woman1.getId(), woman2.getId());
        }
        else throw new IllegalStateException("Cannot compare objects of different classes");
    }
}
public class ComparatorForTwoDiffClasses {
    public static void main(String[] args) {
        List<Man> menList = new ArrayList<>();
        List<Woman> womenList = new ArrayList<>();

        menList.add(new Man(2, "John"));
        menList.add(new Man(1, "Wick"));

        womenList.add(new Woman(2, "Jodie"));
        womenList.add(new Woman(1, "Foster"));

        //custom comparator implementation : IdComparator
        IdComparator idComparator = new IdComparator();

        //ordering
        Collections.sort(menList, idComparator);
        Collections.sort(womenList, idComparator);

        //print
        System.out.println(menList);
        System.out.println(womenList);
    }
}
