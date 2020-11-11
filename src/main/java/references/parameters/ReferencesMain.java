package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person person1 = null;
        Person person2 = null;

        person1 = new Person("John Doe", 1964);
        person2 = person1;

        person2.setName("Jack Doe");

        System.out.println(person1);
        System.out.println(person2);

        int i = 24;
        int j = i;
        j++;

        System.out.println(i);
        System.out.println(j);

        person2 = new Person("Mary", 1999);
        System.out.println(person1);
        System.out.println(person2);

    }
}
