package task2;

public class Main {
    public static void main(String[] args) {
        LogicGame lg = new LogicGame();
        MemoryGame mg = new MemoryGame();

        App.getStatistics(lg);
        App.getStatistics(mg);
    }
}
