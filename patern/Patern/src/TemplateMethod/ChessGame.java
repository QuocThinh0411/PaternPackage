package TemplateMethod;



class ChessGame extends Game {
    @Override
    public void initialize() {
        System.out.println("Initializing chess game...");
    }

    @Override
    public void startGame() {
        System.out.println("Starting chess game...");
    }

    @Override
    public void endGame() {
        System.out.println("Ending chess game...");
    }
}