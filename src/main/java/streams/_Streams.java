package streams;



import java.util.List;
import java.util.stream.Collectors;

import static streams._Streams.Gender.FEMALE;
import static streams._Streams.Gender.MALE;


public class _Streams {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Alex", FEMALE),
                new Person("Mary", FEMALE),
                new Person("John", MALE),
                new Person("Angie", FEMALE)
        );

        people.stream()
                .map(person -> person.mGender)
                .collect(Collectors.toSet())
                .forEach(gender -> System.out.println(gender));

        //gets all the names of person in set to remove duplicates
        people.stream()
                .map(name -> name.name)
                .collect(Collectors.toSet())
                .forEach(gender -> System.out.println(gender));

        boolean b = people.stream().allMatch(person -> FEMALE.equals(person.mGender));
        System.out.println(b);

        /*
        The
        map function of stream api transforms an object into another state
        collect, takes all the mapped object into a data structure
        foreach, iterates through each object

        THE STREAM JAVA api helps to write very clean conscise code
         */
    }


    static class Person{
        private final String name;
        private final Gender mGender;

        public Person(String name, Gender gender) {
            this.name = name;
            mGender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", mGender=" + mGender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
