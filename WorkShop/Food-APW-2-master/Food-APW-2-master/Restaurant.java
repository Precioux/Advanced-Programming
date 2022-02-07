package com.company;
/**
 * Restaurant Data
 * for AP Workshop-session 2
         * @author Samin Mahdipour
        * @since 10.2.2021
 */
public class Restaurant {
    private String name;
    private String food;
    public int price;

    public Restaurant(String name,String food,int price) {
        this.name=name;
        this.food = food;
        this.price=price;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name restaurant
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return food
     */
    public String getFood() {
        return food;
    }

    /**
     *
     * @param food restaurant
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     *
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     *
     * @param price food
     */
    public void setPrice(int price) {
        this.price = price;
    }
    public void print(){
        System.out.println(name+" : "+food+" - "+price+"$");
    }
}
