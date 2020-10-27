package builder.classic;

public class SpiderManBuilder implements HeroBuilder {
    private Hero hero;

    public SpiderManBuilder() {
        this.hero = new Hero();
    }

    @Override
    public void buildName() {
        this.hero.setName("Spiderman");
    }

    @Override
    public void buildCostume() {
        this.hero.setCostume("spider costume");
    }

    @Override
    public void buildPower() {
        this.hero.setPower("web");
    }

    @Override
    public void buildAttack() {
        this.hero.setAttack(18);
    }

    @Override
    public void buildArmor() {
        this.hero.setArmor(12);
    }

    @Override
    public Hero buildHero() {
        return this.hero;
    }
}
