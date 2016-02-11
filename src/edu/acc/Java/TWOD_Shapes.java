package edu.acc.Java;

/**
 * Created by lewis on 2/1/16.
 */

public class TWOD_Shapes {


    double A = 0;
    static double answer;
    public TWOD_Shapes(int[] dimensions) {
        int addup = 0;
        getCircleArea(dimensions);
        getTriangleArea(dimensions);
        getSquareArea(dimensions);

    }




    public static void main(String[] args) {

        /*
        Take Argument shape type, and various arguements for circle area, square area, and triangle area
        run the dependant instance for the type with an if statement comparing the input "args" to
        circle, square, and triangle to determine which is a viable conversion method.
         */
    if(args.length == 0) {
        System.out.println("Error 212");
        System.exit(212);

    }
        int[] dimensions = new int[3];
        if (args.length == 2) {
            dimensions[1] = Integer.parseInt(args[1]);
        }
        else if(args.length == 3) {
             dimensions[0] = Integer.parseInt(args[1]);
             dimensions[1] = Integer.parseInt(args[2]);

            System.out.println(dimensions[0]);
            System.out.println(dimensions[1]);


        }
        TWOD_Shapes shape = new TWOD_Shapes(dimensions);

        switch(args[0]) {
            case "circle": if (args.length > 1) {
                    double area = shape.getCircleArea(dimensions);
                    System.out.println(area);
                break;

            }

            case "square":if (args.length > 1) {
                double area = shape.getSquareArea(dimensions);
                System.out.println(area);
                break;
            }
            case "triangle": if (args.length > 3) {
                double area = shape.getTriangleArea(dimensions);
                System.out.println(area);
            }

    }






    }

    public double getSquareArea(int[] dimensions) {

        /*
        A=a ^ 2 where "a" is equal to one side.
         */
        A = Math.pow(dimensions[0], 2);

        return A;
    }

    public double getTriangleArea(int[] dimensions) {

        /*
        s(s-a)(s-b)(s-c)
        A = Base * Hight / 2
         */
        System.out.print(dimensions[0] + " " + dimensions[1]);
        A = ((dimensions[0] * dimensions[1]) / 2);
return A;
    }
    private double getCircleArea(int[] dimensions) {

        A = Math.pow(Math.PI * dimensions[0], 2);
        return A;

    }



}

/*
write a shape class with  (3) instance methods
A) getCircleArea();
B) GetSquareArea();
C) GetTriangleArea();
2) Get shape type and dimension to compute area from args

 */