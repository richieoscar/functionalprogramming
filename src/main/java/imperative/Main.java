package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Alex", FEMALE),
                new Person("Mary", FEMALE),
                new Person("John", MALE),
                new Person("Angie", FEMALE)
        );
        //imperative programming style
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
           if(FEMALE.equals(person.mGender)){
               females.add(person);
           }
        }
        for (Person female: females) {
        System.out.println(female);

        }

        System.out.println("Declarative Style");


        //declarative programming style
        //using the stream api
        //declarative style is the functional programming style
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.mGender);
        people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList())
                .forEach(System.out::println);
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
