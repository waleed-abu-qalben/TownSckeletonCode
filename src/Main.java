public class Main {
    private static final YearGenerator yearGenerator  = new YearGenerator();
    private static final Memory memory = Memory.getInstance();

    public static void main(String[] args) {
        generateNewYear();
        takeUserInputs();
    }
    private static void generateNewYear() {
        Thread generationThread = new Thread(() -> {
           // call yearGenerator.generate() every 5 seconds.
        });
        generationThread.start();
    }
    private static void takeUserInputs() {
        Thread userInputThread = new Thread(() -> {
           //take user inputs and call memory.getNumberOfPeople.
        });
        userInputThread.start();
    }
}