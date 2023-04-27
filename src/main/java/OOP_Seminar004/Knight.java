package OOP_Seminar004;

public class Knight extends Warrior<Knife, Protection>{
    public Knight(String name, int hp, Weapon weapon, Protection protection) {
        super(name, hp, (Knife) weapon, protection);
    }

    public Knight(String name, int hp, Weapon weapon) {
        super(name, hp, (Knife) weapon);
    }


//    public boolean havShield() {
//        return this.protection == null;
//    }
//
//    @Override
//    public void reduceHp(int damage) {
//        if (havShield()) {
//            super.reduceHp(damage);
//        } else {
//            int damage_with_defence = damage - protection.defense();
//            if (damage_with_defence < 0) {damage_with_defence = 0;}
//            super.reduceHp(damage_with_defence);
//        }
//    }

    @Override
    public String toString() {
        return "Knight{" +
                super.toString() +
                '}';
    }
}
