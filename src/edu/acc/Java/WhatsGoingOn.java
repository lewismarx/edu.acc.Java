package edu.acc.Java;
import java.util.Scanner;
/**
 * Created by lewis on 1/25/16.
 */
public class WhatsGoingOn {


private static int grade = 0;


    public static void main(String[] args) {
        Scanner grade1 = new Scanner(System.in);

        grade = grade1.nextInt();
    if (grade >= 90) {
        System.out.println("You Get an: A");
        System.exit(1);


    }
    else if (grade >= 80 && !(grade > 90)) {
        System.out.println("You Get a: B");
            System.exit(2);
    }
        else if (grade >= 75 && !(grade > 80)) {
        System.out.println("You Get a: C");
        System.exit(3);
    }
        else if (grade >= 70 && !(grade > 75)) {
        System.out.println("You Get a: D");
        System.exit(4);
    }
        else if (grade < 70) {
        System.out.println("You Fail!!!");
        System.exit(10);
    }
    }
}
