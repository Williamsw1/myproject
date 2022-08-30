package mycakeshop;

import java.lang.Iterable;
import java.util.*;
public class CakeShop < String > implements Iterable < String > {
    private List < String > cakeFlavors;
    CakeShop() {
        this.cakeFlavors = new ArrayList < > ();
    }
    private static int totalFlavors = 0;
    //int totalFlavors = 0;
    public void addCake(String element) {
        cakeFlavors.add(element);
        totalFlavors++;
        //System.out.println("hai:"+totalFlavors);
    }
//    public void printme()
//    {
//    	 System.out.println("again hai:"+totalFlavors);
//    	 totalFlavors++;
//    	 System.out.println("again increment:"+totalFlavors);  	 	
//    }
    
    @Override
    public Iterator < String > iterator() {
        Iterator < String > iter = new Iterator < String > () {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < totalFlavors;
            }

            @Override
            public String next() {
                if (hasNext()) 
                	return cakeFlavors.get(currentIndex++);               
                else throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
       
        return iter;
       
    }
    
}