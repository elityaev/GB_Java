package OOP_Seminar001;

import OOP_Seminar002.SaveToFileImpl;

public class Program {
  public static void main(String[] args) {
    Person person = new Person("Иван Петрович", 30, Gender.male);
    Person child1 = new Person("Артем Иванович", 5, Gender.male);
    Person child2 = new Person("Василий Иванович", 7, Gender.male);
    Person spouse = new Person("Елена Павловна", 28, Gender.female);
    Person father = new Person("Петр Захарович", 65, Gender.male);
    Person mather = new Person("Ольга Семеновна", 64, Gender.female);

    System.out.println(person);

    FamilyTree personFamilyTree = new FamilyTree(person);
//    personFamilyTree.addSpouse(spouse);
    FamilyTree child1FamilyTree =  personFamilyTree.addChild(child1);
    FamilyTree child2FamilyTree = personFamilyTree.addChild(child2);
    personFamilyTree.addFather(father);
    personFamilyTree.addMather(mather);

    System.out.println(personFamilyTree);
    System.out.println(personFamilyTree.getChildren());

    System.out.println(child1FamilyTree);
    System.out.println(child2FamilyTree);

    SaveToFileImpl save = new SaveToFileImpl();
    save.saveToFile(String.valueOf(personFamilyTree));

  }
}
