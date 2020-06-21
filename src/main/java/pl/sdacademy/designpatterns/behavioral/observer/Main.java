package pl.sdacademy.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        PressPublisher pressPublisher = new PressPublisher("ABC ");
        PressReader pressReader = new PressReader("Dariusz Dariusz");
        pressPublisher.addObserver(pressReader);
        pressPublisher.publish("Znaleziono slady zycia na marsie!");

        Billboard billboard = new Billboard();
        pressPublisher.addObserver(billboard);
        pressPublisher.publish("Mecz a i  b zakonczony remisem");
        pressPublisher.publish("Mecz ttt i  122 zakonczony remisem");

    }
}
