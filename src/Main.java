import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Александр ", "Паладин", 35));
        people.add(new Person("Тарье", "Линд из рода Людей Льда", 19));
        people.add(new Person("Тенгель", "Злой", 90));
        people.add(new Person("Таргенур", "Странник Король Людей Льда", 40));

        Collections.sort(people, new PersonsComparator());
        System.out.println(people);
    }
}