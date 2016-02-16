package edu.acc.Java;

/**
 * Created by lewis on 2/10/16.
 */
import java.util.Random;

public class lotto {

    public static void main(String[] args) {

        Random ran = new Random();
        int[] getSix = new int[7];
        String text = "";
        for (int i = 0; i <= 6; i++) {
            int SixCheck = 0;
            for (int j = 0; j <= getSix.length - 1; j++) {

                SixCheck = ran.nextInt(10) + 1;
                    if (text.length() <= 6) {
                        text += Integer.toString(getSix[j]);
                    }
                    System.out.println(text);
                    if (!(text.contains(Integer.toString(SixCheck)))) {
                        getSix[j] = SixCheck;
                    }
                else {
                        getSix[j] = 0;
                    }
                }

            /*for (int number : getSix) {
                System.out.println(number);
            }
            */

            }
            System.out.println("Final");
            for (int m = 0; m < getSix.length - 1; m++)
                System.out.println(getSix[m]);

        }
    }


/*
*import java.util.Random;
* int[] getSix();
* return set of 6 unique random integers
* constrain values to 1-10;
*
*
 */

