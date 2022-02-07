package com.company;
/**
 * @author Samin Mahdipour - 9839039
 * @since 10.31.2021
 * AP-HW3-5
 * This class Define Inventory
 */
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
public class Inventory {
    protected HashMap<Product,Integer> products=new HashMap<>();
    protected ArrayList<Integer> plist=new ArrayList<>();
    /**
     *
     * @param product data for first Time
     */
    public void addToList(Product product)
    {
        products.put(product,0);
        plist.add(product.which);
    }

    /**
     *
     * @param product data
     */
    public void Remove(Product product)
    {
        products.remove(product);
    }
    /**
     *
     * @param product key
     * @param n add
     */
    public void add(Product product,int n){
        int np=products.get(product);
        products.replace(product,np,np+n);
    }

    /**
     *
     * @param product key
     * @param n subtract
     */
    public void Subtract(Product product,int n)
    {
        int np=products.get(product);
        if(np>n)
          products.replace(product,np,np-n);
        else System.err.println("Stock is Not Enough");
    }

    /**
     *
     * @return The printer
     */
    public String toString()
    {
     String data="";
     int i=1;
        Set entrySet = products.entrySet();
        Iterator it = entrySet.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            data+=i+"){\n"+me.getKey().toString()+"  }\n}instock: "+me.getValue()+"\n\n";
            i++;
        }
        return data;
    }
    /**
     * @return if inventory is empty
     */
    public boolean empty(){
        int tot=0;

        for (Map.Entry<Product, Integer> pair: products.entrySet()) {
           tot=tot+pair.getValue();
        }
        if(tot==0)
            return true;
        else return false;
    }


}
