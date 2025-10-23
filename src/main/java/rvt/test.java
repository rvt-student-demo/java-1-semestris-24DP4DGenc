package rvt;

public class test {

    public static void main(String[] args) {
        int a = 34;
        int b = 45;
        int c = -23;
        
        int result = a + b * c - a % c;
        if (result > 0) {
            System.out.println("rezultats ir pozitivs");
        }
        else if(result < 0) {
            System.out.println("rezultats ir negativs");
        }
        else {
            System.out.println("rezultats ir 0");
        }

        if (result % 2 == 0) {
            System.out.println("rezultats ir para skaitlis");
        }
        else {
            System.out.println("rezultats ir nepara skaitlis");
        }
    }
}