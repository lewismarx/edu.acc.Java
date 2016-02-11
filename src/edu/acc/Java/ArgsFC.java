package edu.acc.Java;

/**
 * Created by lewis on 2/3/16.
 */
public class ArgsFC {
    public static void main(String[] args) {
       double x = 0;
        boolean go = true;
        int i = 1;
        String text = "asshole";
        while (100 >= i) {
            try {
                System.out.println(text);
                i++;
                String output = Integer.toString(i,i);
                System.out.println(output);

                 throw new Exception();

            } catch (Exception e) {
                System.out.println("Issue");

            }
        }

    }

}
