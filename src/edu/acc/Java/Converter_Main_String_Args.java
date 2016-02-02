package edu.acc.Java;

/**
 * Created by lewis on 2/1/16.
 */
public class Converter_Main_String_Args {


    public static void main(String[] args) {
        String type = "";
        String convert = "";
        double temperature = 1;
        for (String input : args) {
            input = input.toLowerCase();
            if (input.endsWith("c")) {
                type = " Ends With C" + "\n";
                convert = "c";
            }
            if (input.endsWith("f")) {
                type = " Ends With F" + "\n";
                convert = "f";
            }

            if (input.contains("c")) {
                input = input.replace("c", "");
                convert = "c";


            }
            if (input.contains("f")) {
                input = input.replace("f", "");
            }
            int inputval = Integer.parseInt(input);
            if (convert == "f") {
                temperature = ((inputval - 32) / 1.8000);

            } else if (convert == "c") {
                temperature = (inputval * 1.8000 + 32);
            } else {
                temperature = 0;
            }


            System.out.println(" " + inputval + type + " " + temperature);
        }
    }
}

