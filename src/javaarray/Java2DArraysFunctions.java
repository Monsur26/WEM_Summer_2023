package javaarray;

import java.util.Arrays;

public class Java2DArraysFunctions {
    public static void main(String[] args) {


        int[][] aa = {{21, 54, 21}, {23, 43, 12}, {12, 34, 56}};

        // fetches the length of the rows/sets
        int lengthOfaa = aa.length;

        System.out.println(lengthOfaa);

        // copy of an array
        int [][] bb= aa.clone();

        //  getting all the values
        System.out.println(Arrays.deepToString(aa));

        //  fill function to change all the values of a set to one specific value
        Arrays.fill(bb[2],0);
        System.out.println(Arrays.deepToString(bb));

        //replacing specific value/element

        aa[2][1]=44;
        System.out.println(Arrays.deepToString(aa));

    }
}
