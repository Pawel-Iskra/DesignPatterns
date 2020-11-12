package abstract_factory;

import abstract_factory.cars.*;

public class ContinentalFactory extends CarFactory {
    private final SteeringWheelSide leftSide = SteeringWheelSide.LEFT;

    @Override
    public Car buildHondaCar(HondaType hondaType) {
        switch (hondaType) {
            case CIVIC:
                return new HondaCivic("standard", 140, leftSide);
            case ACCORD:
                return new HondaAccord("luxus", 160, leftSide);
            default:
                throw new IllegalArgumentException("invalid Honda type");
        }
    }

    @Override
    public Car buildToyotaCar(ToyotaType toyotaType) {
        switch (toyotaType) {
            case AVENSIS:
                return new ToyotaAvensis("standard", 120, leftSide);
            case SUPRA:
                return new ToyotaSupra("sport", 280, leftSide);
            default:
                throw new IllegalArgumentException("invalid Toyota type");
        }
    }


}
