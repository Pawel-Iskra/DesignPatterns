package builder.classic;

public class AlfaTypeGarageBuilder implements GarageBuilder {
    private Garage garage;

    public AlfaTypeGarageBuilder() {
        this.garage = new Garage();
    }

    public void buildWalls() {
        this.garage.setWalls("alfaType walls");
    }

    public void buildRoof() {
        this.garage.setRoof("alfaType roof");
    }

    public void buildFloor() {
        this.garage.setFloor("alfaType floor");
    }

    public void buildGate() {
        this.garage.setGate("alfaType gate");
    }

    public void buildWindow() {
        this.garage.setWindow("alfaType window");
    }

    public void buildArea() {
        this.garage.setArea(25);
    }

    public Garage getGarage() {
        return this.garage;
    }
}
