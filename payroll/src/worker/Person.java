package worker;

public class Person {

    protected String name;

    public String getName() {
        return name;
    }

    public Person(String newName, int newWorth) {
        name = newName;
    }

    public Person() {
        name = "";
    }

}
