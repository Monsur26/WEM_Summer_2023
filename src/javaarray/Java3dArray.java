package javaarray;

public class Java3dArray {
    public static void main(String[] args) {
        int[][][] aaa = new int[2][2][2];

        aaa[0][0][0]= 1;
        aaa[0][0][1]= 2;

        aaa[0][1][0]= 3;
        aaa[0][1][1]= 4;

        aaa[1][0][0]= 5;
        aaa[1][0][1]= 6;

        aaa[1][1][0]= 7;
        aaa[1][1][1]= 8;


        for (int i = 0; i <aaa.length ; i++) {
            for (int j = 0; j <aaa[i].length ; j++) {
                for (int k = 0; k < aaa[i][j].length; k++) {
                    System.out.println(aaa[i][j][k]);
                }
            }
        }

        System.out.println("*********************************************************");

        for (int [][]aa:aaa) {
            for (int []a:aa) {
                for (int aLiteral: a) {
                    System.out.println(aLiteral);
                }
            }
        }



    }
}
