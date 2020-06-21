package pl.sdacademy.designpatterns.structural.adapter;

public class CatToDogAdapter implements Dog {
    private Cat cat;

    public CatToDogAdapter(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void woof() {
        cat.meow();
    }

    @Override
    public void eat() {
        cat.eat();
    }
}
