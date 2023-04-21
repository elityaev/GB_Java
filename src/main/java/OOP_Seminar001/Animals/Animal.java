package OOP_Seminar001.Animals;

public abstract class Animal {
    String name;
    int hunger = 60;
    public Animal(String name) {
        this.name = name;
    }

    protected boolean wellFed () {
        if (this.hunger <= 0) {
      System.out.println(this.name + " не голоден");
      return true;
        } else {return false;}
    }

    @Override
    public String toString() {
        return String.format("%s - %d", name, hunger);
    }
}
