package edu.acc.Java;

/**
 * Created by lewis on 1/27/16.
 */


public class Histo {

    public static void main(String[] args) {
        String word1 = "cake";
        String word2 = "cookies";
        String word3 = "Milk";

        String[] data1 = {word1, word2, word3, "elephantishere", "Pseudopseudohadsas", "philidelphia"};
        int length1n = data1.length;
        int[] length1 = {data1.length};
        histogram(data1, length1);


    }

    static void histogram(String[] labels, int[] stars) { // String name label, integer name stars
        for (String piece1 : labels) {


            int length1 = piece1.length();
            int maxlength = 15;


            if (!(length1 > maxlength)) {
                System.out.print(piece1.toLowerCase());
                int endlength = (maxlength) - length1;
                String spacelength = "";
                while (endlength > 0) {
                    spacelength += " ";
                    endlength = endlength - 1;
                }


                String starslength = "";
                String outputtext = "";

                while (length1 > 0 && !(length1 > maxlength)) {

                    starslength += "*";
                    String text = spacelength.concat(starslength);
                    int stringlength = 0;
                    stringlength = starslength.length() + spacelength.length();
                    if (text.length() > maxlength) {
                        outputtext = text.substring(0, maxlength);
                    }
                    else {
                        outputtext = text;
                    }
                    length1 = length1 - 1;
                }
                System.out.print(outputtext);
                System.out.print("\n");

            }
            else{
                System.out.println("Word Length Bypasses Max Screen Length");

            }
        }

    }

    @Override
    public String toString() {
        return "Histo{}";
    }
}

/*
write histo class
static method signature
void histogram(String[] labels, int[] stars){} means
take in input for labels string and integer stars
validate input ( make sure user text is proper )
give useful error message
Start stars on same column, tested using "  *" for input string
using a integer of max length and subtracting the number of letters of the word from it
to determine space and star marks



 */