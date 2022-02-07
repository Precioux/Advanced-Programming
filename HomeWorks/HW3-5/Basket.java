package com.company;
import java.time.LocalDate;
import java.util.*;

/**
 * @author Samin MAhdipour-9839039
 * @since 10.31.2021
 * AP-HW3-5
 * THIS CLASS DEFINE BASKET
 */
public class Basket {
   protected ArrayList<Product> products=new ArrayList<>();
   protected ArrayList<Integer> N=new ArrayList<>();

    /**
     *
     * @param product data
     * @param n data
     */
   public void add(Product product,int n){
       boolean m=products.contains(product);
       if(m==true)
       {
           int i=products.indexOf(product);
           int np=N.get(i);
           N.set(i,np+n);
       }
       if(m==false)
       {
           products.add(product);
           N.add(n);
       }
   }

    /**
     *
     * @param product remover
     */
   public void remove(Product product)
   {
       int i=products.indexOf(product);
       if(N.get(i)>1) {
           int np=N.get(i);
           N.set(i,np-1);
       }
       else {
           products.remove(product);
       }
   }

    /**
     *
     * @return total
     */
   public double Total(){
       int i=0;
       double tot=0;
       for (Product p:products) {
          tot=tot+(p.getPrice())* (N.get(i));
       }
       return tot;
   }
    /**
     * printer
     */
    public String toString()
    {
        int i=1;
        String data="";
        for (Product p:products) {
            data+=i+"){\n"+p.toString()+"  }\n}\n\n";
            i++;
        }
        return data;
    }

}
