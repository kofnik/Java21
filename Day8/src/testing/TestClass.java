package testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kof on 13/01/15.
 * <p/>
 * testing different methods
 */

public class TestClass {
    public static void main(String[] args) {
        List golfer = new ArrayList();

        golfer.add("Tseng");
        golfer.add("Lewis");
        golfer.add("Stanford");

        String s1 = (String) golfer.get(0);
        String s2 = (String) golfer.get(2);

        System.out.println(s1);
        System.out.println(s2);

        golfer.add(1, "Miyazato");
        golfer.add(0, "Kerr");
        golfer.remove(3);

        System.out.println(golfer);

        golfer.set(1, "Kungu");

        System.out.println(golfer);

        //golfer.clear();

        System.out.println(golfer);
        System.out.println();

        boolean isThere = golfer.contains("Webb");
        System.out.println(isThere);

        int i = golfer.indexOf("Stanford");
        System.out.println(i);
        System.out.println();

        golfer.remove("Kungu");
        System.out.println(golfer);

        /*
        Looping through array list and printing out index number and data relating to that index
         */


        //#######################################################
        //#######  Remember this way of looping!!!  #############
        //#######################################################

        System.out.println();
        int index = 0;
        for (Object s : golfer)
            System.out.println((index++) + ": " + s);


        //########################################
        //###  Read more about autoboxing!!!  ####
        //########################################


        System.out.println();
        //Simple for loop using iterator to go through array list 'golfer'
        //This look can be used with any data structure that implements Iterator
        for (Object name : golfer)
            System.out.println(name);


        System.out.println();
        for (Iterator z = golfer.iterator(); z.hasNext();) {
            String name = (String) z.next();
            System.out.println(name);
        }
    }


}





