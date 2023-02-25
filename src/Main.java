import model.Person;
import utils.*;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String personsName = "Michele";
    private static final int personsAge = 25;

    public static void main(String[] args){
        Person person = new Person(personsName, personsAge);
        Logger.logPrintString("Hello " + person);

        Random random = new Random();
        List<Person> personListToLog = new ArrayList<>();

        for (PeopleToLog e: PeopleToLog.values()) {
            personListToLog.add(new Person(e.toString(), random.nextInt(20, 50)));
        }

        Logger.logPrintStrings(personListToLog.stream()
                        .map(Person::getName)
                        .toArray(String[]::new));
    }
}
