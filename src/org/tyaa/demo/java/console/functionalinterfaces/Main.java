package org.tyaa.demo.java.console.functionalinterfaces;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Integer> integerList = Arrays.asList(1, 10, -20, 8, 0, 1, 100);
        List<String> stringList = Arrays.asList("John", "Bill", "Tom", "Mary", "Sarah");
        List<Person> people = Arrays.asList(new Person("John", 23),
                new Person("Bill", 63),
                new Person("Tom", 15),
                new Person("Mary", 13),
                new Person("Sarah", 43),
                new Person("Donald", 43));
	    // UniversalSort.sort(integerList, new IntegerComparator());
        /* UniversalSort.sort(stringList, new IComparator() {
            @Override
            public Integer compare(Object o1, Object o2) {
                return ((String)o2).compareTo((String)o1);
            }
        }); */
        UniversalSort.sort(people, (o1, o2) -> ((Person)o1).age - ((Person)o2).age);
        UniversalSort.sort(people, (o1, o2) -> ((Person)o1).name.compareTo(((Person)o2).name));
        people.forEach(System.out::println);
    }
}
