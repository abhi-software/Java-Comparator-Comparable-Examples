import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 22));

        // Sort people by age using a Comparator
        Collections.sort(people, new AgeComparator());

        // Print the sorted list
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        // Compare persons based on age
        return -(Integer.compare(person1.getAge(), person2.getAge()));
    }
}
