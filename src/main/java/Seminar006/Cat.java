package Seminar006;

import java.util.Objects;

public class Cat implements Comparable<Cat> {

    // private - доступен только внутри класса
    // public - доступен везде
    // default - доступны только внутри пакета
    // protected - тоже что и default + доступен дочерним классам
    private String name;
    private int age;

    public Cat(String name, int age) {
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
    public int compareTo(Cat another) {
        if (age < another.age) {
            return -1;
        } else if (age > another.age) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }

        Cat anotherCat = (Cat) obj;
        return Objects.equals(name, anotherCat.name) && age == anotherCat.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // if obj1.equals(obj2) => obj1.hashCode() == obj2.hashCode()

    @Override
    public String toString() {
        return String.format("%s [%d]", name, age);
    }

}
