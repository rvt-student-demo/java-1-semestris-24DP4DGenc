package rvt;

import java.util.Scanner;

public class java_moc_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int skaits = 0;
        int summa = 0;
        int lielakais = Integer.MIN_VALUE;
        int mazakais = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Ievadi pozitivu skaitli (0 vai negativs skaitlis partrauc ievadi): ");
            int i = scanner.nextInt();

            if (i <= 0) {        
                break;
            }

            skaits++;
            summa += i;

            if (i > lielakais) {
                lielakais = i;
            }
            if (i < mazakais) {
                mazakais = i;
            }
        }

        System.out.println();

        if (skaits == 0) {
            System.out.println("Netika ievadits neviens pozitivs skaitlis.");
        } else {
            double videjaVertiba = (double) summa / skaits;

            System.out.println("Ievadito skaitlu skaits: " + skaits);
            System.out.println("Skaitlu summa: " + summa);
            System.out.println("Videja vertiba: " + videjaVertiba);
            System.out.println("Lielakais skaitlis: " + lielakais);
            System.out.println("Mazakais skaitlis: " + mazakais);
        }

        scanner.close();
    }
}

