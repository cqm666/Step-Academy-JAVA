package store;

public class product {
    String denumireProdus;
    double pret;
    String producator;

    public product(String denumireProdus, double pret, String producator) {
        this.denumireProdus = denumireProdus;
        this.pret = pret;
        this.producator = producator;
    }

    public void showProduct(){
        System.out.println(denumireProdus);
        System.out.println(pret);
        System.out.println(producator);
    }



}
