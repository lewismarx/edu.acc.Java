package edu.acc.Java;

/**
 * Created by lewis on 1/25/16.
 */

import java.util.Scanner;
public class Switch_Case_Format {




    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
int month = 0;
    switch(name.nextLine().toLowerCase()) {

        case "january":
            month = 1;
    break;
        case "february":
            month = 2;
            break;
        case "march":
        month = 3;
            break;
        case "april":
        month = 4;
            break;
        case "may":
            month = 5;
            break;

        case "june":
        month = 6;
            break;
        case "july":
            month = 7;
            break;

        case "august":
            month = 8;
            break;

        case "september":
            month = 9;
                    break;
        case "october":
            month = 10;
            break;
        case "november":
            month = 11;
            break;

        case "december":
            month = 12;
            break;
        default:
            System.out.printf("error input invalid. please restart program and try again ");
                    System.exit(15);

    }
        System.out.println("The Month is Month number: " + month);
*/
String date = "Hello, if after all this time you still want me, to go over.";
       String[] turtle = date.split(",");
        for(String piece : turtle) {

System.out.println(piece);
        }
        System.out.println();
        ;


    }
}
