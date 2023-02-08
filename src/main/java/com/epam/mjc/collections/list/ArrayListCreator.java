package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> filteredList = new ArrayList<>();

        for (int i = 2; i < sourceList.size(); i += 3) {
            String item = sourceList.get(i);
            filteredList.add(item);
            filteredList.add(item);
        }

        return filteredList;
    }
}
