package edu.acc.Java;
/**
 * Created by lewis on 1/25/16.
 */
/**
 * Loan amortization
 * loan amount 6 month term; 2.6 interest rate; calculate payment to pay off loan
 *
 */
public class LoanAmortization {






    static double i = .026;
    static double z;
    static double p = 200;
    static double r = i;

    static double g = p;



    public static void main(String[] args) {
        LoanAmortization la = new LoanAmortization();

        double a = (r+1);
        double b = 6.;
        z = (p * (r + (r/Math.pow(a, b) - 1)));


        System.out.println(z);

        boolean truet = true;
        while (truet == true) {
           g = g - z;
            System.out.printf("Balance is %.2f \n", g);


            if (g <= 0) {
                truet = false;
            }
            else if (g >= p) {
                truet = false;

            }


        }

    }
}
/*
A = p (i + (i/(1+i)^n - 1)


A = P (r(1+r)^n)/((1+r)^n - 1)
A = periodic payment amount
P = amount of principal, net of initial payments, meaning "subtract any down-payments"
i = periodic interest rate
n = total number of payments
 */