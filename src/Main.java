import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Александр ", "Паладин", 35));
        people.add(new Person("Тарье", "Линд из рода Людей Льда", 19));
        people.add(new Person("Тенгель", "Злой", 90));
        people.add(new Person("Таргенур", "Странник Король Людей Льда", 40));
        people.add(new Person("Винга", "Тарк из рода Людей Льда", 16));
        people.add(new Person("Вендель", "Грип", 14));

        Collections.sort(people, new PersonsComparator());
        System.out.println(people);

        Predicate<Person> years18 = (person) -> (person.getAge() < 18);
        people.removeIf(years18);
        System.out.println("Люди младше 18 лет удалены, остались старше 18: " + people);
    }
}