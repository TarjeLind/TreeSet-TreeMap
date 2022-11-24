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

        final int max = 3;
        people.sort((o1, o2) -> {
            int len1 = o1.getSurname().split(" ").length;
            int len2 = o2.getSurname().split(" ").length;
            if (Math.min(len1, max) != Math.min(len2, max)) {
                return Integer.compare(len1, len2);
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        });
        System.out.println(people);
    }
}