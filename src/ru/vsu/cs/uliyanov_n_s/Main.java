package ru.vsu.cs.uliyanov_n_s; //v1.01

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Enter the number of goals of the N-team in the first match:");
        int n1 = readGoals();

        System.out.print("Enter the number of goals of the M-team in the first match:");
        int m1 = readGoals();

        System.out.print("Enter the number of goals of the N-team in the second match:");
        int n2 = readGoals();

        System.out.print("Enter the number of goals of the M-team in the second match:");
        int m2 = readGoals();

        if (n1 < 0 || n2 < 0 || m1 < 0 || m2 < 0 || n2 == m2)
            System.out.println("You entered an incorrect value!");
        else if ((n1 + n2) > (m1 + m2))
            System.out.print("N-team will advance to the next round");
        else if ((n1 + n2) < (m1 + m2))
            System.out.print("M-team will advance to the next round");
        else if ((n1 + m1) == (n2 + m2))
            finalPenaltyShootout();
        else if (n2 > m2)
            System.out.print("N-team will advance to the next round");
        else if (m1 > n1)
            System.out.print("M-team will advance to the next round");


    }

    public static void finalPenaltyShootout() {
        System.out.println("Another penalty shootout is needed!");

        System.out.print("Enter how many goals scored N-team on the final penalty shootout:");
        int n3 = readGoals();

        System.out.print("Enter how many goals scored M-team on the final penalty shootout:");
        int m3 = readGoals();

        if (n3 > m3)
            System.out.print("N-team will advance to the next round");
        else if (m3 > n3)
            System.out.print("M-team will advance to the next round");
        else
            System.out.println("You entered an incorrect value!");

    }

    public static int readGoals() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
