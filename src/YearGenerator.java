import java.security.SecureRandom;

public class YearGenerator {
    private final Memory memory = Memory.getInstance();
    private final Town town = Town.getInstance();
    private static final SecureRandom generator = new SecureRandom();
    public void generateNewYear() throws InterruptedException {
       generatePeople();
       removeDeadPeople();
       archivePeopleAlive();
       updateCurrentYear();

    }
    private void generatePeople ()  {
       // generate people and store them in the people map concurrently.
    }
    private  void removeDeadPeople() {
       //remove dead people from the people map;
    }
    private void archivePeopleAlive() {
     // count the number of alive people in the people map, and store that count in the archive map.

    }
    private void updateCurrentYear() {
       //increment the current year by one;
    }



}
