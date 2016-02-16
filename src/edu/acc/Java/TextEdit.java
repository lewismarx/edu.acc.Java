package edu.acc.Java;

/**
 * Created by lewis on 2/10/16.
 */

import java.util.Scanner;
public class TextEdit {

    public static void main(String[] args) {
        String[] replacetext = new String[2];
        Scanner input = new Scanner(System.in);
        boolean runagain = false;
        while (runagain == false) {
            String inputText = input.nextLine();
            String replaceText = input.nextLine();
            if (replaceText.contains(":")) {
                replacetext = replaceText.split(":");
                inputText = inputText.toLowerCase().replaceAll(replacetext[0], replacetext[1]);
            } else {
                System.out.println(inputText);

            }
            System.out.println(inputText);
            System.out.println("Do you want more?");
            String continue1 = input.nextLine();
            System.out.println(continue1);
            if (continue1 == "yes") {
                runagain = false;
            }
            if(continue1 == "no"){
                runagain = true;
            }


        }
    }
}



/*
Write a TextEditor Class that gets a user entered sentence
then allows changes in two word pairs
ie old:new
if ":" is missing output the
finished sentence.




 */