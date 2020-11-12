package abstract_factory.cars;

abstract public class Car {
    private String equipment;
    private int power;
    private SteeringWheelSide side;

    protected Car(String equipment, int power, SteeringWheelSide side) {
        this.equipment = equipment;
        this.power = power;
        this.side = side;
    }

    @Override
    public String toString() {
        return "Car{" +
                "equipment='" + equipment + '\'' +
                ", power=" + power +
                ", side=" + side +
                '}';
    }
}
