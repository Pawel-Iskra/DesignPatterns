package abstract_factory;

import abstract_factory.cars.Car;
import abstract_factory.cars.HondaType;
import abstract_factory.cars.ToyotaType;

abstract public class CarFactory {

    public abstract Car buildHondaCar(HondaType hondaType);
    public abstract Car buildToyotaCar(ToyotaType toyotaType);
}
