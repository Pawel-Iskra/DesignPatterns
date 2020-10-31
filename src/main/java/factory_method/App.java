package factory_method;

import factory_method.units.Factory;
import factory_method.units.Unit;
import factory_method.units.UnitFactory;
import factory_method.units.UnitType;

public class App {
    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        System.out.println("tank = " + tank);

        Unit goliath = factory.createUnit(UnitType.GOLIATH);
        System.out.println("goliath = " + goliath);

    }
}
