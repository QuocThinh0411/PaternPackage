package templatemethod;

public class Test {
public static void main(String[] args) {
    Game footballGame = new FootballGame();
    footballGame.play();


    Game chessGame = new ChessGame();
    chessGame.play();
}
}
