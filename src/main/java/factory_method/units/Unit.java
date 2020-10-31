package factory_method.units;

abstract public class Unit {
    private int hp;
    private int armor;
    private int attack;

    protected Unit(int hp, int armor, int attack) {
        this.hp = hp;
        this.armor = armor;
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "hp=" + hp +
                ", armor=" + armor +
                ", attack=" + attack +
                '}';
    }
}
