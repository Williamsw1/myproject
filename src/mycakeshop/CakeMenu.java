package mycakeshop;

//github changing

import java.lang.Iterable;
import java.util.Iterator;
//import mycakeshop.CakeShop;
public class CakeMenu {
    public static void main(String[] args){
        CakeShop menu = new CakeShop();
        menu.addCake("Vanilla Cake");
        menu.addCake("Chocolate Cake");
        menu.addCake("Pineapple Cake");
        menu.addCake("Cheese Cake");
        menu.addCake("Strawberry Cake");
        //menu.printme();
        System.out.println("Printing Menu using Iterator");
        Iterator<String> iter = menu.iterator();
        while(iter.hasNext()){
            String cake = iter.next();
            System.out.println(cake);
        }
    }
}