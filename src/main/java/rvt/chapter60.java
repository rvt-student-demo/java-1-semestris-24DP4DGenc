package rvt;

public class chapter60 {
    public static void main ( String[] args ){
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();
    }
    public static void Exercise1() {
        int[] val = {0, 1, 2, 3}; 

        int sum = val[0] + val[1] + val[2] + val[3];
     
        System.out.println( "Sum of all numbers = " + sum );
    }
            public static void Exercise2() {
                int[] val = {13, -4, 82, 17}; 
        int[] twice = {26, -8, 164, 34};
    
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );



    System.out.println( "New Array: " 
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
        }
                public static void Exercise3() {
                    int[] valA   = { 13, -22,  82,  17}; 
                    int[] valB   = {-12,  24, -79, -13};
                    int[] sum    = {  1,  2,   3,   4};
    

 
                    System.out.println( "sum: " 
                        + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
        }
                    public static void Exercise4() {
                        int[] valA   = { 13, -22,  82,  17}; 
                        int[] valB   = { 12,   47,  -57,   8};
    
   
 
    System.out.println( "valA: " 
        + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
 
    System.out.println( "valB: " 
        + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

    System.out.println( "sum:  " 
        + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " 
        + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
                    }
                            public static void Exercise5() {
                                    int[] val = {0, 1, 2, 3}; 
                                    int temp = val[1];
 
                                System.out.println( "Original Array: " 
                                + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

                                val[0] = val[3];
                                val[1] = val[2];
                                val[2] = temp;
                                val[3] = temp - 1;


  
                                System.out.println( "Reversed Array: " 
                                + val[3] + " " + val[2] + " " + val[1] + " " + val[0] );
                                }
}