package OOP_Seminar003;

public class Program {
    public static void main(String[] args){
        Person person1 = new Person("Иван Петрович", 30, Gender.male);
        Person spouse = new Person("Елена Павловна", 28, Gender.female);
        Person child1 = new Person("Артем Иванович", 5, Gender.male);
        Person child2 = new Person("Василий Иванович", 7, Gender.male);
        Person father = new Person("Петр Захарович", 65, Gender.male);
        Person mather = new Person("Ольга Семеновна", 64, Gender.female);


        FamilyTree person1FamilyTree = new FamilyTree(person1);
        System.out.println(person1FamilyTree);

        // Добавляем супругу
        person1FamilyTree.addRelation(spouse, Relation.SPOUSE);
        System.out.println(person1FamilyTree);
        // Добавляем детей
        person1FamilyTree.addRelation(child1, Relation.CHILDREN);
        person1FamilyTree.addRelation(child2, Relation.CHILDREN);
        System.out.println(person1FamilyTree);
        // Добавляем родителей
        person1FamilyTree.addRelation(father, Relation.PARENT);
        person1FamilyTree.addRelation(mather, Relation.PARENT);
        System.out.println(person1FamilyTree);

        System.out.println();
        // Красивый вывод
        person1FamilyTree.prettyToString();




    }
}
