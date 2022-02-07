package com.company;
/**
 * @author Samin Mahdipour - 9839039
 * @since 10-30-2021
 * AP-HW3-5
 */

import javafx.util.converter.LocalDateTimeStringConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Product {
    protected String name;
    private String type;
    private double weight;
    private double price;
    private LocalDate exp;
    private LocalDate prod;
    protected int which;
    /**
     *
     * @param name data
     * @param type data
     * @param weight data
     * @param price data
     * @param exp data
     * @param prod data
     */
    public Product(String name, String type, double weight, double price, LocalDate prod, LocalDate exp) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.exp = exp;
        this.prod = prod;
        String[] p=new String[8];
        p[0]="Carrot";
        p[1]="Apple";
        p[2]="12xEggs";
        p[3]="Oats";
        p[4]="Salmon";
        p[5]="Steak";
        p[6]="Milk";
        p[7]="Cheese";
        for(int i=0;i<8;i++)
        {
            if(name.equals(p[i]))
                which=i;
        }
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
     * @param name data
     */
    public void setName(String name) {
        this.name = name;

    }

    /**
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type data
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @param weight data
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @param price data
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * @return exp date
     */
    public LocalDate getExp() {
        return exp;
    }

    /**
     *
     * @param exp data
     */
    public void setExp(LocalDate exp) {
        this.exp = exp;
    }

    /**
     *
     * @return prod data
     */
    public LocalDate getProd() {
        return prod;
    }

    /**
     *
     * @param prod data
     */
    public void setProd(LocalDate prod) {
        this.prod = prod;
    }

    /**
     *
     * @return true if exp time is after prod time
     */
    public boolean check()
    {
        if(exp.compareTo(prod)>0)
            return true;
        else return false;
    }
    /**
     * String of data
     */
    public String toString()
    {
        return String.format("\"NAME\": \"")+name+String.format("\",\n")+String.format("\"CATEGORY\": \"")+type+String.format("\",\n")+String.format("\"WEIGHT\": \"")+weight+String.format("\",\n")+String.format("\"PRICE\": \"")+price+String.format("\",\n")+String.format("\"MANUFACTURE_DATE\": ")+prod+String.format(",\n")+String.format("\"EXPIRATION_DATE\": ")+exp+String.format(",\n");
    }

}
