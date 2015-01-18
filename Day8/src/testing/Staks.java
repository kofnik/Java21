package testing;

import java.util.Stack;

/**
 * Created by kof on 15/01/15.
 */
public class Staks {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("One");
        s.push("Two");
        s.push("Three");
        s.push("Four");
        s.push("Five");
        s.push("Six");

        int index = 0;
        for (Object o : s)
            System.out.println((index++) + ": " + o);
        System.out.println();

        String s1 = (String) s.pop();
        String s2 = (String) s.pop();

        int i = 0;
        for (Object o : s)
            System.out.println((i++) + ": " + o);
        System.out.println();

        String s3 = (String) s.peek();

        System.out.println(s3);
        System.out.println();

        int j = s.search("Two");
        System.out.println(j);
        System.out.println();

        boolean isEmpty = s.empty();
        System.out.println(isEmpty);

    }


}

