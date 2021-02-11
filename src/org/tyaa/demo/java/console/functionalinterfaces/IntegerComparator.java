package org.tyaa.demo.java.console.functionalinterfaces;

public class IntegerComparator implements IComparator {
    @Override
    public Integer compare(Object o1, Object o2) {
        return ((Integer)o1) - ((Integer)o2);
    }
}
