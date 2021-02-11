package org.tyaa.demo.java.console.functionalinterfaces;

import java.util.List;

public class UniversalSort {
    public static void sort (List list, IComparator comparator) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                Object item = list.get(i);
                Object nextItem = list.get(i + 1);
                if (comparator.compare(item, nextItem) < 0) {
                    Object temporaryItem = item;
                    list.set(i, nextItem);
                    list.set(i + 1, temporaryItem);
                    isSorted = false;
                }
            }
        }
    }
}
