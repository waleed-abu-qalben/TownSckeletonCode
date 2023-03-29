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
    private void generatePeople () throws InterruptedException {

    }
    private  void removeDeadPeople() {

    }
    private void archivePeopleAlive() {


    }
    private void updateCurrentYear() {

    }



}
