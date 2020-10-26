package builder.classic;

public class Main {
    public static void main(String[] args){

        AlfaTypeGarageBuilder alfaTypeGarageBuilder = new AlfaTypeGarageBuilder();
        BetaTypeGarageBuilder betaTypeGarageBuilder = new BetaTypeGarageBuilder();

        GarageDirector alfaTypeGarageDirector = new GarageDirector(alfaTypeGarageBuilder);
        alfaTypeGarageDirector.buildGarage();

        GarageDirector betaTypeGarageDirector = new GarageDirector(betaTypeGarageBuilder);
        betaTypeGarageDirector.buildGarage();


        Garage alfaTypeGarage = alfaTypeGarageDirector.getGarage();
        System.out.println(alfaTypeGarage);

        Garage betaTypeGarage = betaTypeGarageDirector.getGarage();
        System.out.println(betaTypeGarage);

    }
}
