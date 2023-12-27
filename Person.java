public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // Compare persons based on age
        return Integer.compare(this.age, otherPerson.age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Compare persons using the compareTo method
        int result = person1.compareTo(person2);

        if (result < 0) {
            System.out.println(person1.getName() + " is younger than " + person2.getName());
        } else if (result > 0) {
            System.out.println(person1.getName() + " is older than " + person2.getName());
        } else {
            System.out.println(person1.getName() + " and " + person2.getName() + " are of the same age.");
        }
    }
}
