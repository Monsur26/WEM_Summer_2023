package javaarray;

import java.util.Arrays;

public class Java2DArrays {
    public static void main(String[] args) {
        int [] a={5,6,7};

        int [][] aa= {{21,54,21},{23,43,12},{12,34,56}};

        System.out.println(aa[0][0]);
        System.out.println(aa[1][0]);
        System.out.println(aa[2][1]);
        System.out.println(aa[2][2]);

        System.out.println("************* *********** ***********");
        int[][] number= new int[3][4]; // 3 sets and max values in each sets are 4

        number[0][0]=21;
        number[0][1]=23;
        number[0][2]=245;
        number[0][3]=221;

        number[1][0]=143;
        number[1][1]=41;
        number[1][2]=143;
        number[1][3]=12;

        number[2][0]=43;
        number[2][1]=3441;
        number[2][2]=3434;
        number[2][3]=86;

        System.out.println(number[2][0]);
        System.out.println("********* ***** ***********");


        //iterate to find all the values using for loop
        for (int i = 0; i <number.length ; i++) {
            for (int j = 0; j <number[i].length ; j++) {
                System.out.println(number[i][j]);
            }
        }

        System.out.println("********** ******* ************");

        int [][] bb= {{21,54,21},{23,43,12},{12,34,56},{32,32,4},{43,43,21}};

        for (int [] num1: bb){
            for (int num2: num1) {
                System.out.println(num2);
            }
        }
        System.out.println("^^^^&&&&****");
        String [][] name= new String[2][2];

        name[0][0]="Jack";
        name[0][1]="John";

        name[1][0]="Monsur";
        name[1][1]="KhanJada";


        for (int i = 0; i <name.length ; i++) {
            for (int j = 0; j <name[i].length ; j++) {
                System.out.println(name[i][j]);
            }
            System.out.println(" \n\nset "+ i + " is done\n\n");
        }

        for (String [] covertTo1D:name)
              {
                  for (String covertToLiteral:covertTo1D)
                        {
                            System.out.println(covertToLiteral);
                  }
        }
    }
}
