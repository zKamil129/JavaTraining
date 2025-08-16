package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayvsArraylist {
    public static void main(String[] args) {

        //create
        String[] friendsArray2 = {"John","Bob","Zbyszek","Fifosz"};
        ArrayList<String> friendsArrayList2 =
                new ArrayList<>(Arrays.asList("Bob","malypies","fifonsz","Otto"));
        //get element
        System.out.println(friendsArray2[1]);
        System.out.println(friendsArrayList2.get(1));
        //get size
        System.out.println(friendsArray2.length);
        System.out.println(friendsArrayList2.size());
        //add element
        friendsArrayList2.add("DDDUPA");
        System.out.println(friendsArrayList2.get(4));

        //set an element
        friendsArray2[0] = "MalyPies";
        System.out.println(friendsArray2[0]);
        friendsArrayList2.set(0,"Costma");
        System.out.println(friendsArrayList2.get(0));

        //remove element
        friendsArrayList2.remove(1);
        System.out.println(friendsArrayList2.get(1));

        //print
        System.out.println(friendsArray2);
        System.out.println(friendsArrayList2);


    }
}
