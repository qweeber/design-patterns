package pl.sdacademy.designpatterns.creational.singleton;

public class UniverseV2 {
    //--------------------------------------------
    private final static UniverseV2 instance = new UniverseV2();

    private double mass;
    private double avgTemperature;

    private UniverseV2(){}

    public static UniverseV2 getInstance() {
        return instance;
    }

    //--------------------------------------------

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getAvgTemperature() {
        return avgTemperature;
    }

    public void setAvgTemperature(double avgTemperature) {
        this.avgTemperature = avgTemperature;
    }
}
