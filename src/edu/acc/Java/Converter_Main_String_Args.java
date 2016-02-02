package edu.acc.Java;

/**
 * Created by lewis on 2/1/16.
 * @param temperature in celsius or fahrenheit
 *
 */
public class Converter_Main_String_Args {


    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No Args Found");
            return;
        }
        String type = "";
        String convert = "";
        double temperature = 1;
        for (String input : args) {
            input = input.toLowerCase();
            if (input.endsWith("c")) {
                type = " Ends With C" + "\n"; // sets type variable to printout with value c
                convert = "c";  // sets String convert to "c" so that it is accessible even after string conversion to
                                // Integer with Integer.parseInt(String st);
            }
            if (input.endsWith("f")) {
                type = " Ends With F" + "\n"; // Sets type variable to value "F"
                convert = "f";  // sets String convert to "f" so that it is accessible even after string conversion to
                                // Integer with Integer.parseInt(String st);
            }

            if (input.contains("c")) {
                input = input.replace("c", "");
                convert = "c";

/**
 * Converts Fahrenheit to Celsius
 * @params Temperature
 * @return
 *
 */
            }
            if (input.contains("f")) {
                input = input.replace("f", "");
            }
            int inputval = Integer.parseInt(input);
            String TempConv = "";
            if (convert == "f") {
                temperature = ((inputval - 32) / 1.8000); // temperature fahrenheit to celsius conversion
                TempConv = "c";

            } else if (convert == "c") {
                temperature = (inputval * 1.8000 + 32); // temperature celsius to fahrenheit conversion
                TempConv = "f";
            } else {
                temperature = 0;
                TempConv = "You're Stupid";
                return;
            }


            System.out.println(" " + inputval + type + " " + temperature + " " + TempConv.toUpperCase());
        }
    }
}

