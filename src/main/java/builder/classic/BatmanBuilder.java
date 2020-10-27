package builder.classic;

public class BatmanBuilder implements HeroBuilder {
    private Hero hero;

    public BatmanBuilder() {
        this.hero = new Hero();
    }

    @Override
    public void buildName() {
        this.hero.setName("Batman");
    }

    @Override
    public void buildCostume() {
        this.hero.setCostume("BatCostume");
    }

    @Override
    public void buildPower() {
        this.hero.setPower("Batmobils");
    }

    @Override
    public void buildAttack() {
        this.hero.setAttack(20);
    }

    @Override
    public void buildArmor() {
        this.hero.setArmor(40);
    }

    @Override
    public Hero buildHero() {
        return this.hero;
    }
}
