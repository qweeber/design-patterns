package pl.sdacademy.designpatterns.creational.singleton;

public class UniverseV3 {
    //--------------------------------------------
    private static UniverseV3 instance;

    public static UniverseV3 getInstance() {
        if(instance == null){
            instance = new UniverseV3();
        }
        return instance;
    }

    private UniverseV3(){}

    //--------------------------------------------
    private double mass;
    private double avgTemperature;

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
