public enum Players {
    Red(Colors.RED.color + "O"+Colors.RESET.color),
    Blue(Colors.BLUE.color + "O"+Colors.RESET.color);

    String symbol;

    Players(String symbol) {
        this.symbol = symbol;
    }
}
