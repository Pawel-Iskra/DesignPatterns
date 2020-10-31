package factory_method.units;

public class UnitFactory extends Factory {

    public Unit createUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(100, 40, 50);
            case GOLIATH:
                return new Goliath(60, 25, 25);
            default:
                throw new IllegalArgumentException("invalid unit type");
        }
    }


}
