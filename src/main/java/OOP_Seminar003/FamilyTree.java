package OOP_Seminar003;

import java.util.*;

public class FamilyTree {
  Person person;

  private Map<String, List> familyTree;

  public FamilyTree(Person person) {
    this.person = person;
    this.familyTree = new HashMap<String,List>();
  }

  public void addRelation(Person relative_person, Relation relation) {
    if (this.familyTree.containsKey(relation.toString())) {
      List listOfRelatives = this.familyTree.get(relation.toString());
      listOfRelatives.add(relative_person);
      this.familyTree.put(String.valueOf(relation), listOfRelatives);
    } else {
      List<Person> listOfRelatives = new ArrayList();
      listOfRelatives.add(relative_person);
      this.familyTree.put(String.valueOf(relation), listOfRelatives);
    }
  }

  public void prettyToString() {
    System.out.printf(
        """
          -----------------------------------
          Генеалогическое древо: %s,
          ***********************************
          """,
        this.person);
    for (String entry : this.familyTree.keySet()) {
      System.out.printf("%s: ", entry);
      List relatives = this.familyTree.get(entry);

      for (Object relative : relatives) {
        System.out.println("" + relative);
      }
      System.out.println("""
                        ***********************************
                        """);
    }
    System.out.println("""
                        -----------------------------------
                        """);
  }

  @Override
  public String toString() {
      if (this.familyTree.isEmpty()) {
          return "Генеалогическое древо еще не заполнено";
      } else {return this.familyTree.toString();}
  }
}
