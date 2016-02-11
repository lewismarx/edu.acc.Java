package edu.acc.Java;

/**
 * Created by lewis on 2/10/16.
 */
public class ConsonantChecker {
        public ConsonantChecker(char input) {
            isConsonant(input);
        }


        public boolean isConsonant(char input) {




                switch (input) {

                    case 'b':


                        return true;
                    case 'c':


                        return true;
                    case 'd':


                        return true;
                    case 'f':


                        return true;
                    case 'g':


                        return true;
                    case 'h':


                        return true;

                    case 'j':



                        return true;


                    case 'k':


                        return true;
                    case 'l':


                        return true;
                    case 'm':



                        return true;
                    case 'n':


                        return true;

                    case 'p':


                        return true;
                    case 'q':


                        return true;
                    case 'r':



                        return true;
                    case 's':


                        return true;
                    case 't':


                        return true;

                    case 'v':



                        return true;
                    case 'w':


                        return true;
                    case 'x':


                        return true;
                    case 'y':


                        return true;
                    case 'z':


                        return true;
                    default:


                        return false;

                }
            }

        public static void main(String[] args) {
            String words = "hello aardvarkien how are you today";
            ConsonantChecker one = new ConsonantChecker(words.charAt(0));
            int count = 0;
            for (int k = 0; k < words.length(); k++) {
                if (one.isConsonant(words.charAt(k))) {
                    count++;
                    System.out.print(words.charAt(k) + " ");

                }
            }
            System.out.println();
            System.out.println("Vowel count: " + count);
        }


    }




