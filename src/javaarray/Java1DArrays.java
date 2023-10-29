package javaarray;

import java.util.Arrays;

public class Java1DArrays {
    public static void main(String[] args) {
        //One Dimensional Array or 1D Array
        int [] a={12,87,54};
        String [] str1={"Abc", "DEF", "GHI","iyug","khjkg"};
        char [] ch1={'A', 'B', 'C'};
        double [] db1={2.90,4.65,3.54};

        // length of an array
        int lengthOfInta = str1.length;
        System.out.println(lengthOfInta);

        // finding values on specific index
        System.out.println("The second value of my int a is "+ a[1]);
        System.out.println("The second value of my str1  is "+ str1[1]);

/*        //index out of bound
        System.out.println("The second value of my int a is "+ a[5]);*/

        // Iterate over the Array to get all the values using for loop
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
        System.out.println("**************** ************** ********************");

        //Iterate over the Array to get all the values using for loop
        for(double d: db1){
            System.out.println(d);
        }

        System.out.println("******* ********** ********* *********");

        // printing all the values using Arrays class
        System.out.println(Arrays.toString(a));
    }
}
