package builder.classic;

public class Main {
    public static void main(String[] args) {
        HeroDirector batmanDirector = new HeroDirector(new BatmanBuilder());
        batmanDirector.buildHero();
        Hero batman = batmanDirector.getHero();
        System.out.println("batman = " + batman);

        HeroDirector spidermanDirector = new HeroDirector(new SpiderManBuilder());
        spidermanDirector.buildHero();
        Hero spiderman = spidermanDirector.getHero();
        System.out.println("spiderman = " + spiderman);

    }
}
