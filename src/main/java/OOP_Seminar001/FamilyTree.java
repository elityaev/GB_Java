package OOP_Seminar001;

import OOP_Seminar002.SaveToFile;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree extends Tree implements AddRelation, SaveToFile {

    private Person spouse;
    private Person father;
    private Person mather;
    private List<Person> children;


    public FamilyTree(Person person) {
        this.person = person;
        this.children = new ArrayList<>();
    }

    public FamilyTree addChild(Person child) {
        this.children.add(child);
        FamilyTree childFamilyTree = new FamilyTree(child);
        if (this.person.getGender() == Gender.male) {
            childFamilyTree.father = this.person;
            if (this.spouse != null) {
                childFamilyTree.mather = this.spouse;
            }
        } else {
            childFamilyTree.mather = this.person;
            if (this.spouse != null) {
                childFamilyTree.father = this.spouse;
            }
        }
        return childFamilyTree;
    }

    public void addSpouse(Person spouse) {
        this.spouse = spouse;
    }


    public void addFather(Person father) {
        this.father = father;
        FamilyTree fatherFamilyTree = new FamilyTree(father);
        fatherFamilyTree.children.add(this.person);
    }

    public void addMather(Person mather) {
        this.mather = mather;
        FamilyTree matherFamilyTree = new FamilyTree(mather);
        matherFamilyTree.children.add(this.person);
    }

    public String getChildren() {
        String children = new String();
        for(int i = 0; i < this.children.size(); i++) {
            if (i != this.children.size() - 1) {
            children += this.children.get(i) + ", ";
            } else {
                children += this.children.get(i);
            }
        }
        return children;
    }

    @Override
    public String toString() {
        return String.format(
                """
              -----------------------------------
              Генеалогическое древо: %s,
              Жена: %s,
              Дети: %s,
              Отец: %s,
              Мать: %s
              -----------------------------------
              """, person, spouse, this.getChildren(), father, mather
        );
    }
}
