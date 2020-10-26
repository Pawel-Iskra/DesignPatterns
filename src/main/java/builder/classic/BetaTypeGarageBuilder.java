package builder.classic;

public class BetaTypeGarageBuilder implements GarageBuilder{
    private Garage garage;

    public BetaTypeGarageBuilder() {
        this.garage = new Garage();
    }
    public void buildWalls() {
        this.garage.setWalls("betaType walls");
    }

    public void buildRoof() {
        this.garage.setRoof("betaType roof");
    }

    public void buildFloor() {
        this.garage.setFloor("betaType floor");
    }

    public void buildGate() {
        this.garage.setGate("betaType gate");
    }

    public void buildWindow() {
        this.garage.setWindow("betaType window");
    }

    public void buildArea() {
        this.garage.setArea(50);
    }

    public Garage getGarage() {
        return this.garage;
    }
}
