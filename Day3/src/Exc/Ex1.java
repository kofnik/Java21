package Exc;

import java.util.StringTokenizer;

public class Ex1 {
    public static void main(String[] args) {

        StringTokenizer bday = new StringTokenizer("04/29/2013", "/");

        while (bday.hasMoreTokens())
        System.out.print("\t" + bday.nextToken());
    }
}
