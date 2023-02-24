import model.Person;
import utils.Logger;

public class Main {
    public static final String personsName = "Michele";
    public static final int age = 25;

    public static void main(String[] args){
        Logger l = new Logger();
        Person p = new Person(personsName, age);
        Logger.logPrintString("Hello " + p);
    }
}
