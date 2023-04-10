package Seminar006;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Cat cat = new Cat("Murzic", 5);
    String name = cat.getName();
    //    System.out.println(name);
    //    System.out.println(cat);

    Person person1 = new Person("Иван", "Иванов", 18, "male", 1.76, false);
    Person person2 = new Person("Татьяна", "Иванова", 25, "female", 1.60, true);
    Person person3 = new Person("Петр", "Петров", 30, "male", 1.95, true);
    Person person4 = new Person("Андрей", "Петров", 14, "male", 1.70, false);
    Person person5 = new Person("Иван", "Иванов", 18, "male", 1.76, false);

    //    System.out.println(person1);
    //    System.out.println(person1.getAge());

    Set<Person> personSet = new HashSet<>();
    personSet.add(person1);
    personSet.add(person2);
    personSet.add(person3);
    personSet.add(person4);
    personSet.add(person5);
    System.out.println(personSet.size());
    System.out.println(person1.equals(person5));

    for (Person person : personSet) {
      if (person.getAge() > 20) {
        System.out.println(getPersonCard(person));
      }
    }
  }

  public static String getPersonCard(Person person) {
    return String.format(
        """
                  -----------------------------------
                  Фамилия: %s,
                  Имя: %s,
                  Возраст: %d,
                  Семейное положение: %s,
                  Рост: %s
                  """,
        person.last_name,
        person.first_name,
        person.getAge(),
        person.getMaritalStatus(),
        person.literalHeight());
  }
}
