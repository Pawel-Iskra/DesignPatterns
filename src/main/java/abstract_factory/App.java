package abstract_factory;


import abstract_factory.cars.Car;
import abstract_factory.cars.ToyotaType;

public class App {
    public static void main(String[] args) {
        CarFactory continentalFactory = new ContinentalFactory();
        CarFactory gbFactory = new GreatBritainFactory();

        Car toyotaSupraCont = continentalFactory.buildToyotaCar(ToyotaType.SUPRA);
        Car toyotaSupraGB = gbFactory.buildToyotaCar(ToyotaType.SUPRA);

        System.out.println("toyotaSupraCont = " + toyotaSupraCont);
        System.out.println("toyotaSupraGB = " + toyotaSupraGB);
    }
}
