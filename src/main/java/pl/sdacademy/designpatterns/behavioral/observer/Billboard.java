package pl.sdacademy.designpatterns.behavioral.observer;

public class Billboard implements PressObserver {
    private String text;


//
//    public Billboard(String text) {
//        this.text = text;
//    }

    @Override
    public void update(String paper) {
        System.out.println("Z billboardu zdejmowany jest tekst: " + text
                + ", od teraz wyswietlany jest: " + (text = paper.substring(0, 10)));
    }
}
