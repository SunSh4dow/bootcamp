package de.walter.alexander.tictactoe;

import java.util.Objects;
import java.util.Random;
import java.util.Arrays;

public class TicTacToeSolver {

    public static int[][] solver1(int tic[][]) {

        boolean free = false;
        while (!free) {
            int x = new Random().nextInt(tic.length);
            int y = new Random().nextInt(tic.length);

            if (tic[x][y] == 0) {
                free = true;
                tic[x][y] = 1;
            }
        }
        return tic;
    }

    public static void printer(int[][] tic) {
        for (int[] row : tic)
            System.out.println(Arrays.toString(row));
    }

    public static int[][] solver2(int tic[][]) {

        boolean free = false;
        while (!free) {
            int q = new Random().nextInt(tic.length);
            int z = new Random().nextInt(tic.length);

            if (tic[q][z] == 0) {
                free = true;
                tic[q][z] = 2;
            }
        }
        return tic;
    }

    public static String checker(int tic[][]) {
        String winner;
        int numOfFreePlaces = 0;

        for (int i = 0; i < tic.length; i++) {
            for (int j = 0; j < tic[i].length; j++) {
                if (tic[i][j] == 0) {
                    numOfFreePlaces++;
                    System.out.println(numOfFreePlaces);
                }
                if (tic[i][j] != 0 && numOfFreePlaces == 1 && j == tic.length) {
                    winner = "0";
                    return winner;
                }
            }
        }
        for (int p = 1; p < tic.length; p++) {
            for (int i = 0; i < tic.length; i++) {
                for (int j = 0; j < tic[i].length; j++) {

                    winner = String.valueOf(p);
                    if (tic[0][0] == p && tic[1][1] == p && tic[2][2] == p) {
                        return winner;
                    }
                    if (tic[0][0] == p && tic[0][1] == p && tic[0][2] == p) {
                        return winner;
                    }
                    if (tic[1][0] == p && tic[1][1] == p && tic[1][2] == p) {
                        return winner;
                    }
                    if (tic[2][0] == p && tic[2][1] == p && tic[2][2] == p) {
                        return winner;
                    }
                    if (tic[0][0] == p && tic[1][0] == p && tic[2][0] == p) {
                        return winner;
                    }
                    if (tic[0][1] == p && tic[1][1] == p && tic[2][1] == p) {
                        return winner;
                    }
                    if (tic[0][2] == p && tic[1][2] == p && tic[2][2] == p) {
                        return winner;
                    }
                }

            }

        }
        winner = "None";
        return winner;
    }


    public static void main(String[] args) {

        int sizeOfField = Integer.parseInt(args[0]);
        String begin = "None" , result = "None";
        //result = new String("None");
        int tic[][] = new int[sizeOfField][sizeOfField];
        TicTacToeSolver play = new TicTacToeSolver();
        while (Objects.equals(result, begin)) {
            tic = play.solver1(tic);
            play.printer(tic);
            result = play.checker(tic);
            if (!Objects.equals(result, begin)) break;
            tic = play.solver2(tic);
            play.printer(tic);
            result = play.checker(tic);
        }
        System.out.println("The winner is player: " + result);


    }
}