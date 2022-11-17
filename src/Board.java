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

    public static void match() {
        printBoard();
        while (true) {
            System.out.println(Players.Blue.symbol + " play:");
            if (round(Players.Blue)) {
                break;
            }
            System.out.println(Players.Red.symbol+" play:");
            if (round(Players.Red)) {
                break;
            }
        }
        System.out.println("Game Over!");
    }

    public static boolean round(Players player) {
        setPositions(player);
        printBoard();
        if (checkWin(player)) {
            System.out.println(player.symbol + " wins");
            return true;
        }
        return false;
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

    public static boolean checkWin(Players players) {
        if (checkLine(players)) {
            return true;
        }
        if (checkCol(players)) {
            return true;
        }
        if (checkFirstDiag(players)) {
            return true;
        }
        if (checkSecondDiag(players)) {
            return true;
        }
        return false;
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
                System.out.println("LINE " + players.symbol);
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
                System.out.println("COLLUMN" + players.symbol);
                return true;
            }
        }
        return false;
    }

    public static boolean checkFirstDiag(Players players) {
        int counter = 0;
        for (int i = 0; i < positions.length; i++) {
            if (positions[i][i].equals(players.symbol)) {
                counter++;
            }
            if (counter == 4) {
                System.out.println("DIAG" + players.symbol);
                return true;
            }
        }
        return false;
    }

    public static boolean checkSecondDiag(Players players) {
        int counter = 0;
        for (int i = positions.length - 1; i >= 0; i--) {
            for (int j = 0; j < positions[0].length; j++) {
                if (positions[i][j].equals(players.symbol)) {
                    counter++;
                }
            }
            if (counter == 4) {
                System.out.println("DIAG" + players.symbol);
                return true;
            }
        }
        return false;
    }
}

