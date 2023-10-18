package com.javamasterclass.solid.goodcode.srp;

import lombok.Getter;
import lombok.Setter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
class Journal {
    //should contain data related to Journal only : why - separation of concern (one class one responsibility)
    private List<String> journalEntry = new ArrayList<>();
    public void addEntryToJournal(String entry) {
        journalEntry.add(entry);
        System.out.println("Entry added to journal");
    }
    public void removeEntry(String entry) {
        journalEntry.remove(entry);
    }
}

class Persistence {
    //should contain data related to Persistence only : why - separation of concern (one class one responsibility)
    public void addEntryToFile(String entry) {

        try (FileOutputStream outputStream = new FileOutputStream("file.txt")) {
            outputStream.write(entry.getBytes());
            System.out.println("Entry added to File");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(
                    """
                            "try-with-resources" statement :
                            resource closed automatically when no longer needed
                    """
            );
        }
    }
}
public class SRP {
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addEntryToJournal("entry 1");

        Persistence persistence = new Persistence();
        persistence.addEntryToFile("entry 1");
    }
}

//Downsides if NO SRP
/*
        1. Code hard to maintain / refactor
        2. Code becomes fragile (more bugs)
        3. Code no longer reusable
        4. Code hard to test
        5. Code hard to understand
 */