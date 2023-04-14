package OOP_Seminar001;

public class Person {
    private String name;
    private Integer age;

    private Gender gender;

    public Person (String name, Integer age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " (" + age + " лет, пол: "  + gender + ")";
    }
}
