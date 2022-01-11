package store;
import store.productMethod;

import java.util.Scanner;

public class productSwitch {
    Scanner sc = new Scanner(System.in);
    short n;
    productMethod prMethod = new productMethod();
    public void ProductSwitch(){

        System.out.println("1. Product info ");
        System.out.println("2. Total price ");
        System.out.println("3. Exit ");
        while(true){
            System.out.print("Choose ::  ");
            n=sc.nextShort();
            switch(n){
                case 1:
                    prMethod.showProduct();
                    break;
                case 2:
                    prMethod.sumPrice();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default: System.out.println("Ati introdus o optiune gresita");
            }
        }





    }

}
