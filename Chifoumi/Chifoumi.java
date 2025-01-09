package Chifoumi;

public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        return switch (chifoumiAction) {
            case ROCK -> chifoumiAction.SCISSOR;
            case SCISSOR -> chifoumiAction.PAPER;
            case PAPER -> chifoumiAction.ROCK;
        };
    }
}
