public class Main {
    public static void main(String[] args) {
        Board.printBoard();
        Board.setPositions(Players.Blue);
        Board.printBoard();
        Board.setPositions(Players.Red);
        Board.printBoard();
        Board.setPositions(Players.Blue);
        Board.printBoard();
        Board.setPositions(Players.Red);
        Board.printBoard();
        Board.setPositions(Players.Red);
        Board.printBoard();
        Board.setPositions(Players.Blue);
        Board.printBoard();
        Board.printBoard();
        Board.setPositions(Players.Red);
        Board.printBoard();
        Board.setPositions(Players.Red);
        Board.printBoard();
        Board.setPositions(Players.Red);
        Board.printBoard();
        Board.setPositions(Players.Blue);
        Board.checkDiag(Players.Blue);
        Board.printBoard();
    }
}