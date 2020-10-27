package builder.classic;

public interface HeroBuilder {

    void buildName();
    void buildCostume();
    void buildPower();
    void buildAttack();
    void buildArmor();

    Hero buildHero();
}
