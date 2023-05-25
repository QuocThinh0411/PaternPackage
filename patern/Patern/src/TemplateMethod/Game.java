package TemplateMethod;


abstract class Game {
    // Template method
    public final void play() {
        initialize();
        startGame();
        endGame();
    }

    public abstract void initialize();

    public abstract void startGame();

    public abstract void endGame();
}