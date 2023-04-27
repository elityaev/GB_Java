package OOP_Seminar004;

public abstract class Person {
    private String name;
    private int hp;

    public Person(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

     public boolean isAlive(){
        return this.hp > 0;
     }

     public void reduceHp(int damage){
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
     }

}
