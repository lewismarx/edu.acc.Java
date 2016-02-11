package edu.acc.Java;

/**
 * Created by lewis on 2/3/16.
 */
public class testclass1 {
    public static void main(String[] args) {
        testclass1 c1 = new testclass1();
        testclass1 c2 = new testclass1();
        System.out.println(c1.hashCode() + " " + c2.hashCode() );
    }
}
