package com.javamasterclass.solid.badcode.srp;

import lombok.Getter;
import lombok.Setter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Journal {
    private List<String> journalList = new ArrayList<>();
    public void addEntryToJournal(String text) {
        journalList.add(text);
    }
    public void removeEntryFromJournal(String text) {
        journalList.remove(text);
    }
    public void addEntryToFile(String text) {
        try (FileOutputStream outputStream = new FileOutputStream("sample.txt")) {
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
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
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addEntryToJournal("entry 1");
        journal.addEntryToFile("entry 2");
    }
}
