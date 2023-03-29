import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Town {

    private static Town instance = null;
    private final ConcurrentMap<Integer, Integer> people;
    private Town(){
     people = new ConcurrentHashMap<>();
    }

    public static Town getInstance() {
        if(instance == null) {
            instance = new Town();
        }
        return instance;
    }


    public  void insertPerson(int key) {

    }

    public  ConcurrentMap<Integer, Integer> getPeople() {
        return people;
    }
    public  int removeYear(int year){

        return 0;
    }

    public int getPeopleAlive(){
        return 0;
    }
}
