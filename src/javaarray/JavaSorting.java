package javaarray;

import java.util.Arrays;

public class JavaSorting {

    public static void bubbleSorting(int [] arr){
        int size= arr.length; //number of elements in an array

        // Going through each elements of an Array
        for (int i = 0; i < size-1 ; i++)

            // Going to compare array elements
            for (int j = 0; j < size -i-1 ; j++)

                // compares two elements
                // based on whether or not jth position element is greater than (j+1)th position element
                if(arr[j] > arr[j +1]){

                    // swapping of elements happens when elements are not in order
                    int temp = arr [j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }

    }

    public static void main(String[] args) {
        int [] arr= {3,6,38,48,287,39,293,2934,21,87,64};

        bubbleSorting(arr);

        System.out.println(Arrays.toString(arr));

        int secondHighestIndex=arr.length-2;
        int lowestElementIndex= 0;

        System.out.println("Second Highest element of the array :"+ arr[secondHighestIndex]);
        System.out.println("Lowest element of the array :"+ arr[lowestElementIndex]);
    }
}
