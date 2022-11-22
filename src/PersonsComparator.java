import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        int countSurname1 = o1.getSurname().split(" ").length;
        int countSurname2 = o2.getSurname().split(" ").length;
        if (countSurname1 > o1.getMaxSurname() && countSurname2 > o1.getMaxSurname()) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            return Integer.compare(countSurname2, countSurname1);
        }
    }
}