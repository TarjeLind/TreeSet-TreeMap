public class Person {

    private String name;
    private String surname;
    private int age;
    private int maxSurname;


    @Override
    public String toString() {
        return "\nЛичность: " + name + "," + " " + surname + "," + " " + age;
    }

    public int getMaxSurname() {
        return maxSurname;
    }

    public void setMaxSurname(int maxSurname) {
        this.maxSurname = maxSurname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.maxSurname = 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}