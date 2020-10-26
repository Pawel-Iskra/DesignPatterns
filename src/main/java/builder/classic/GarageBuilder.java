package builder.classic;

public interface GarageBuilder {

    void buildWalls();
    void buildRoof();
    void buildFloor();
    void buildGate();
    void buildWindow();
    void buildArea();

    Garage getGarage();
}
