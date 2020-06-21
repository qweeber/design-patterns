package pl.sdacademy.designpatterns.behavioral.strategy;

public class BowShutStrategy implements HitStrategy{

    @Override
    public void hit() {
        System.out.println("Strzal z łuku.");
    }
}
