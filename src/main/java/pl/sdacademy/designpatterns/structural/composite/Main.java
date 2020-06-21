package pl.sdacademy.designpatterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        CocaColaCan cocaColaCan = new CocaColaCan();
        Snickers snickers = new Snickers();

        CompositeProduct compositeProduct = new CompositeProduct(cocaColaCan, snickers);
        System.out.println(compositeProduct.getPrice());
    }
}
