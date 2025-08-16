package org.example;

import java.util.*;

public class hashAndHashset {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("MalyPies");
        System.out.println(names);
        names.add("Ola");
        names.add("Kamil");
        names.add("Fifonsz");

/*
        for (String name: names){
            System.out.println(name);
        }

        names.forEach(System.out::println);
        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        names.remove("Ola");
        names.clear();
        System.out.println(names);
        System.out.println(names.contains("Kamil"));
 */

        List<Integer> numberList= new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);

        System.out.println(numberList);

        Set<Integer> numberSet = new TreeSet<>(numberList);
        //numberSet.addAll(numberList);

        System.out.println(numberSet);






    }
}
