package edu.acc.Java;

/**
 * Created by lewis on 2/3/16.
 */
public class ArrayFC {

  static int i = 0;
    static int k = 0;
    double ctemps1;

    float[] f_temps2 = {95, 23, 54, 44, 120};
    double[] c_temps = new double[5];
    int f_temps3 = f_temps2.length;
    public int getF_temps3() {
        return f_temps3;
    }



    public ArrayFC() {
      convert(f_temps2);
    }

    public static void main(String[] args) {
    int f_temps5 = 5;
    float[] f_temps1 = new float[5];

        ArrayFC convert = new ArrayFC();
    convert.convert(f_temps1);







    }


    public void convert(float[] f_temps) {
        int j = 0;
        String outputtext = "";
        double temp1 = 0;
        while (i < f_temps.length){

                if(j < c_temps.length - 1) {
                    temp1 = ((f_temps[j] - 32) / 1.8);

                    j++;

                    System.out.println(temp1);
                    c_temps[j] = temp1;
                }
            }
            int kill = 0;
            while(i < 1){


                for (double ctemp : c_temps) {
                    outputtext += "\n";
                    outputtext += " ";

                    outputtext += Double.toString(ctemp);

                }
                System.out.print(outputtext);
                kill++;
                i++;
            }

        }
    }

