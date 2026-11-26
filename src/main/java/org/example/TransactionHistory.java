package org.example;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    private final List<String> entries = new ArrayList<>();
    public void record(String entry) {
        entries.add(entry);
    }
}
