package Seminar006;

import java.util.Objects;

public class Person {
  /**
   * Создать класс Person. У класса должны быть поля: 1. Имя (String) 2. Фамилия (String) 3. Возраст
   * (продумать тип) 4. Пол 5*. Придумать свои собственные поля
   *
   * <p>Для этого класса 1. Реализовать методы toString, equals и hashCode. 2*. Придумать
   * собственные методы и реализовать их
   *
   * <p>В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на
   * экран.
   */
  String first_name;

  String last_name;
  private int age;
  private String sex;
  private Double height;
  private boolean married;

  public Person(
      String first_name, String last_name, int age, String sex, double height, boolean married) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.age = age;
    this.sex = sex;
    this.height = height;
    this.married = married;
  }

  public String getName() {
    return String.format("%s %s", last_name, first_name);
  }

  public int getAge() {
    return age;
  }

  public String getMaritalStatus() {
    if (this.married == true) {
      if (this.sex == "male") {
        return "женат";
      } else {
        return "замужем";
      }
    } else {
      if (this.sex == "male") {
        return "не женат";
      } else {
        return "не замужем";
      }
    }
  }

  public String literalHeight() {
    if (this.height < 1.65) {
      return "низкий";
    } else if (this.height > 1.65 && this.height < 1.80) {
      return "средний";
    } else {
      return "высокий";
    }
  }

  @Override
  public String toString() {
    return String.format("%s %s", last_name, first_name);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof Person)) {
      return false;
    }

    Person anotherPerson = (Person) obj;
    return Objects.equals(first_name, anotherPerson.first_name)
        && Objects.equals(last_name, anotherPerson.last_name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(last_name, age, height);
  }
}
