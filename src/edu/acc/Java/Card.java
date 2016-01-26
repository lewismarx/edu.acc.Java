package edu.acc.Java; /**
 * Created by lewis on 1/20/16.
 */
/**
 *
 */



import java.util.Random;
/**
 * @author lewism
 *
 * @params none
 *
 * Don't look at me!!
 *
 **/

public class Card {


    public String name; // Public String name used for names of strings
    Random ran1 = new Random();	// Random Class used for a RNG
    /**
     * @param args
     */
 /*
  * Default Constructor
  *
  * Given for free
  *
  */


    String name1;
    private String[] names = {"Frank", "Bob", "Casey", "Steve", };
    private int age = 0; // Private Integer Age only accessible with getters and setters

    public Card() {



        this.name = "squid";

    }

    public Card(String rand) {
        this.age = ran1.nextInt(150);
        this.name = names[ran1.nextInt(5)];
    }

    /**
     *
     * @param none
     * Using random to generate a random age for the card using java.util.Random Class
     *
     *
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
/*
 * edu.acc.Java.Card 1-10 with RNG for the card numbers.
 */

        Card[] cards = new Card[10];





        }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = names[ran1.nextInt(5)];
    }


/*
 * look for youngest and name
 *
 * Don't Do It Like This!!!
 *
 * I'm stupid and used else if which can complicate things.
 *
 */


    }
    /*
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static char RanChar() {
        Random r = new Random();
        char random_3_Char = (char) (48 + r.nextInt(47));
        return random_3_Char;
    }
    public static char RanLetter() {
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a');
        return c;
    }
*/
