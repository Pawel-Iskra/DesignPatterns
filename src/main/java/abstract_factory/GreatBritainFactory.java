package abstract_factory;


import abstract_factory.cars.*;

public class GreatBritainFactory extends CarFactory {
    private final SteeringWheelSide rightSide = SteeringWheelSide.RIGHT;

    @Override
    public Car buildHondaCar(HondaType hondaType) {
        switch (hondaType) {
            case CIVIC:
                return new HondaCivic("standard", 140, rightSide);
            case ACCORD:
                return new HondaAccord("luxus", 160, rightSide);
            default:
                throw new IllegalArgumentException("invalid Honda type");
        }
    }

    @Override
    public Car buildToyotaCar(ToyotaType toyotaType) {
        switch (toyotaType) {
            case AVENSIS:
                return new ToyotaAvensis("standard", 120, rightSide);
            case SUPRA:
                return new ToyotaSupra("sport", 280, rightSide);
            default:
                throw new IllegalArgumentException("invalid Toyota type");
        }
    }
}
