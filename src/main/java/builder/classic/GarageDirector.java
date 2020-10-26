package builder.classic;

public class GarageDirector {

    private GarageBuilder garageBuilder;

    public GarageDirector(GarageBuilder garageBuilder) {
        this.garageBuilder = garageBuilder;
    }

    public void buildGarage() {
        garageBuilder.buildWalls();
        garageBuilder.buildRoof();
        garageBuilder.buildFloor();
        garageBuilder.buildGate();
        garageBuilder.buildWindow();
        garageBuilder.buildArea();
    }

    public Garage getGarage() {
        return this.garageBuilder.getGarage();
    }

}
