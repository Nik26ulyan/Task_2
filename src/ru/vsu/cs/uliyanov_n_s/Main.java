package ru.vsu.cs.uliyanov_n_s;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n1 = readValueOfGoals("N", "first");
        int m1 = readValueOfGoals("M", "first");
        int n2 = readValueOfGoals("N", "second");
        int m2 = readValueOfGoals("M", "second");

        checkCorrectnessOfScoreOfSecondMatch(n2, m2);

        String winningTeam = calculateWhoWillAdvance(n1, n2, m1, m2);

        printResult(winningTeam);
    }

    public static void printResult(String winningTeam) {
        System.out.println(winningTeam + "-team will advance to next round.");
    }

    public static String calculateWhoWillAdvance(int n1, int n2, int m1, int m2) {

        String winningTeam = null;

        if ((n1 + n2) > (m1 + m2))
            winningTeam = "N";
        else if ((n1 + n2) < (m1 + m2))
            winningTeam = "M";
        else if (n2 > m2)
            winningTeam = "N";
        else if (m1 > n1)
            winningTeam = "M";

        return winningTeam;
    }

    public static void checkCorrectnessOfScoreOfSecondMatch(int n2, int m2) {

        if (n2 == m2) {
            System.out.println("It's impossible, you probably forgot about penalty shootout in the second match!");
            System.exit(0);
        }
    }

    public static int readValueOfGoals(String nameOfTeam, String numberOfMatch) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the value of goals of the %s-team in the %s match:", nameOfTeam, numberOfMatch);

        int valueOfGoals;

        if (scanner.hasNextInt()) {
            valueOfGoals = scanner.nextInt();

            if (valueOfGoals < 0) {
                System.out.println("Invalid value! Try again.");
                return readValueOfGoals(nameOfTeam, numberOfMatch);
            }

        } else {
            System.out.println("Invalid value! Try again.");
            return readValueOfGoals(nameOfTeam, numberOfMatch);
        }

        return valueOfGoals;
    }
}