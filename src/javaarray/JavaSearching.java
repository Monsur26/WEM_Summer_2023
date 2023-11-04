package javaarray;

import java.util.Arrays;

public class JavaSearching {
    public static void simpleSearch(int [] arr, int x){
        int foundIndex = -1;
        for (int i = 0; i < arr.length ; i++)
            if (arr[i] == x) {
                foundIndex=i;
            }

        if (foundIndex != -1) {
            System.out.println("Element is found at index number :"+ foundIndex);
        } else {
            System.out.println("Element not found!!");
        }
    }

    public static int binarySearchElement(int []arr, int x){
        int l=0;
        int r=arr.length-1;
        while(l<=r){

            int m=l+(r-l)/2;

            if (arr[m] == x)
                return m;
            if (arr[m] <x)
                l=m+1;
            else
                r=m-1;

        }
        return -1;
    }



    public static void main(String[] args) {
        int []arr= {3,6,774,324,542,32,6,78,4,676};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int result= binarySearchElement(arr, 32); //
        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("The element is present at index : "+ result);
        }


       // simpleSearch(arr,78);
    }
}
