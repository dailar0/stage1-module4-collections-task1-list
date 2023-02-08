package com.epam.mjc.collections.list;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    private final Function<String, BigInteger> extractor = s -> BigInteger.valueOf(5)
            .multiply(new BigInteger(s))
            .multiply(new BigInteger(s))
            .add(BigInteger.valueOf(3));

    @Override
    public int compare(String a, String b) {
        try {
            int result = extractor.apply(a).compareTo(extractor.apply(b));
            if (result == 0) {
                return Integer.compare(
                        Integer.parseInt(a),
                        Integer.parseInt(b));
            }
            return result;
        } catch (NumberFormatException e) {
            throw new ClassCastException(e.getMessage());
        }
    }
}
