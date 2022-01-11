package store;
import store.product;

public class productMethod<pr> {
    product[] pr = new product[5];

    public void insertProduct(){
        pr[0] = new product("Sapon", 20.4, "On-Line");
        pr[1] = new product("Praf-Spalat", 50.6, "Ariel");
        pr[2] = new product("Pasta de dinti", 90.4, "Lacalut");
        pr[3] = new product("Prosoape de bucatarie", 41.4, "Panda");
        pr[4] = new product("Periuta dinti", 16.7, "Orbit");
    }


    public void showProduct(){

        for (int i = 0; i < 5; i++) {

            pr[i].showProduct();

        }
    }

    public void sumPrice(){
        double sum=0;
        for (int i = 0; i < 5; i++) {
            sum+=pr[i].pret;
        }
        System.out.println("***********************");
        System.out.println("Total price  :: " + sum);
    }
}
