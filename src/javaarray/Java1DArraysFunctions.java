package javaarray;

import java.util.Arrays;

public class Java1DArraysFunctions {

    public static void main(String[] args) {


        int[] b = {21, 454, 32, 213, 434, 1};

        // sorting an array to ascending order
        Arrays.sort(b);

        System.out.println(Arrays.toString(b));

        b[3]=76;  // specifically changing one element array value

        System.out.println(Arrays.toString(b));

/*        Arrays.fill(b,90); // changing all the element value to a specific value

        System.out.println(Arrays.toString(b));*/

        int [] c= Arrays.copyOf(b,b.length -1);

        System.out.println(Arrays.toString(c));



    }
}
