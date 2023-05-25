package templatemethod;

class FootballGame extends Game {
    @Override
    public void initialize() {
        System.out.println("Initializing football game...");
    }

    @Override
    public void startGame() {
        System.out.println("Starting football game...");
    }

    @Override
    public void endGame() {
        System.out.println("Ending football game...");
    }
}	