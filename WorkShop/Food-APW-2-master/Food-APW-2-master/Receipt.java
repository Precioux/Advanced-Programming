package com.company;
/**
 * Receipt maker
 * for AP Workshop-session 2
         * @author Samin Mahdipour
        * @since 10.2.2021
 */
public class Receipt {
    private Restaurant Where;
    private Student Who;
    private int Code;
    private int cashnew;

    /**
     *
     * @param Where place identity
     * @param Who   person identity
     */
    public Receipt(Restaurant Where,Student Who) {
        this.Where = Where;
        this.Who=Who;
        cashnew=0;
    }

    /**
     * This Method publishes the receipt
     */
    public void publisher(){
        Who.print();
        Where.print();
        cashnew=Who.cash-Where.price;
        System.out.println("Cash : "+cashnew+"$");

    }
}
