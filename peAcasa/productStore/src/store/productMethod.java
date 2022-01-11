package store;
import store.product;

public class productMethod<pr> {
    product[] pr = new product[5];


    public void showProduct(){
        pr[0] = new product("Sapon", 20.4F, "On-Line");
        pr[1] = new product("Praf-Spalat", 50.6F, "Ariel");
        pr[2] = new product("Pasta de dinti", 90.4F, "Lacalut");
        pr[3] = new product("Prosoape de bucatarie", 41.4F, "Panda");
        pr[4] = new product("Periuta dinti", 16.7F, "Orbit");
        for (int i = 0; i < 5; i++) {

            pr[i].showProduct();

        }
    }

    public void sumPrice(){
        int sum=0;
        for (int i = 0; i < 5; i++) {
            sum+=pr[i].pret;
        }
        System.out.println("Total price  :: " + sum);
    }
}
