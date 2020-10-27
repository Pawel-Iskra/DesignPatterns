package builder.classic;

public class HeroDirector {
    private HeroBuilder heroBuilder;

    public HeroDirector(HeroBuilder heroBuilder) {
        this.heroBuilder = heroBuilder;
    }

    public void buildHero(){
        heroBuilder.buildName();
        heroBuilder.buildCostume();
        heroBuilder.buildPower();
        heroBuilder.buildAttack();
        heroBuilder.buildArmor();
    }

    public Hero getHero(){
        return this.heroBuilder.buildHero();
    }
}
