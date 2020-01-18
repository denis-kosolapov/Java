package Collection;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main (String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Сергей", 38));
        persons.add(new Person("Даша", 7));
        persons.add(new Person("Глаша", 3));
        persons.add(new Person("Саша", 6));
        persons.add(new Person("Анна", 19));

        /*императивный подсчет среднего возраста выбраных людей*/
        int summa = 0;
        int adultPersons = 0;
        for (Person p : persons)
            if (p.getAge() >= 18) {
                summa += p.getAge();
                adultPersons++;
            }
        double averageAge = (double) summa/adultPersons;
            System.out.println(averageAge);

        System.out.println();

//        for (Person p : persons)
//            System.out.println(p);

        /*Декларативный подход*/
        double averageAge2 = persons.stream().filter(p -> p.getAge() >= 18).mapToInt(p -> p.getAge()).average().getAsDouble();
        System.out.println(averageAge2);

        persons.stream().filter(p -> p.getAge() >= 18).sorted((p1,p2) -> p1.getName().compareTo(p2.getName())).map(p -> p.getName()).forEach(System.out::println);
    }
}
