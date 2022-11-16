import java.util.Scanner;

public class Board {
    static Scanner scanner = new Scanner(System.in);

    static String[][] positions = new String[][]{{" ", " ", " ", " "}, {" ", " ", " ", " "}, {" ", " ", " ", " "}, {" ", " ", " ", " "}};


    public static void printBoard() {
        System.out.println(" -----------------");
        for (int i = 0; i < positions.length; i++) {
            for (int j = 0; j < positions[i].length; j++) {
                System.out.print(" | ");
                System.out.print(positions[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println(" -----------------");
    }

    public static void setPositions(Players players) {
        int choice = scanner.nextInt() - 1;
        for (int i = positions.length - 1; i >= 0; i--) {
            if (positions[i][choice].equals(" ")) {
                positions[i][choice] = players.symbol;
                return;
            }
        }
    }

    public static boolean checkLine(Players players) {
        int counter = 0;
        for (int i = 0; i < positions.length; i++) {
            counter = 0;
            for (int j = 0; j < positions[i].length; j++) {
                if (positions[i][j].equals(players.symbol)) {
                    counter++;
                }
            }
            if (counter == 4) {
                System.out.println("LINHA");
                return true;
            }
        }
        return false;
    }

    public static boolean checkCol(Players players) {
        int counter = 0;
        for (int i = 0; i < positions.length; i++) {
            counter = 0;
            for (int j = 0; j < positions[i].length; j++) {
                if (positions[j][i].equals(players.symbol)) {
                    counter++;
                }
            }
            if (counter == 4) {
                System.out.println("COLUNA");
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiag(Players players) {
        int counter = 0;
        int j=0;
        for (int i = 0; i < positions.length; i++) {
            counter = 0;
            if (positions[i][j].equals(players.symbol)) {
                counter++;
            }
            j++;
            if (counter == 4) {
                System.out.println("DIAG");
                return true;
            }
        }

        return false;
    }
}

