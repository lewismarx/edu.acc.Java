/**
 * Created by lewis on 1/20/16.
 */
/**
 *
 */
package edu.acc.java;


import java.util.Random;
/**
 * @author lewis
 *
 */
public class Card {

    Random ran1 = new Random();	// Random Class used for a RNG

    private int age = 0; // Private Integer Age only accessible with getters and setters
    public String name; // Public String name used for names of strings


    /**
     * @param args
     */
 /*
  * Default Constructor
  *
  * Given for free
  *
  */

    public Card() {



        this.name = "squid";

    }
    public Card(String rand) {
        this.age = ran1.nextInt(150);
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
 * Card 1-10 with RNG for the card numbers.
 */
        Card card1 = new Card("a");
        card1.setAge(card1.age);
        Card card2 = new Card("b");
        card2.setAge(card2.age);

        Card card3 = new Card("c");
        card3.setAge(card3.age);

        Card card4 = new Card("d");
        card4.setAge(card4.age);

        Card card5 = new Card("e");
        card5.setAge(card5.age);

        Card card6 = new Card("f");

        card6.setAge(card6.age);
        Card card7 = new Card("g");
        card7.setAge(card7.age);
        Card card8 = new Card("h");
        card8.setAge(card8.age);
        Card card9 = new Card("i");
        card9.setAge(card9.age);
        Card card10 = new Card("j");
        card10.setAge(card10.age);

/*
 * look for youngest and name
 *
 * Don't Do It Like This!!!
 *
 * I'm stupid and used else if which can complicate things.
 *
 */
        int youngest = card1.getAge();
        if(card1.getAge() < youngest ) {
            card1.name = "youngest";
            youngest = card1.getAge();

        }
        else if(card2.getAge() < youngest) {
            card2.name = "youngest";
            youngest = card2.getAge();

        }
        else if(card3.getAge() < youngest) {
            card3.name = "youngest";
            youngest = card3.getAge();


        }
        else if(card4.getAge() < youngest) {
            card4.name = "youngest";
            youngest = card4.getAge();


        }
        else if(card5.getAge() < youngest) {
            card5.name = "youngest";
            youngest = card5.getAge();


        }
        else if(card6.getAge() < youngest) {
            card6.name = "youngest";
            youngest = card6.getAge();

        }
        else if(card7.getAge() < youngest) {
            card7.name = "youngest";
            youngest = card7.getAge();


        }
        else if(card8.getAge() < youngest) {
            card8.name = "youngest";
            youngest = card8.getAge();


        }
        else if(card9.getAge() < youngest) {
            card9.name = "youngest";
            youngest = card9.getAge();


        }
        else if(card10.getAge() < youngest) {
            card10.name = "youngest";
            youngest = card10.getAge();


        }

        System.out.println("Youngest Card Is" + youngest);
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}