package com.company;
/**
 * Student data
 *  * for AP Workshop-session 2
 *  * @author Samin Mahdipour
 *  * @since 10.2.2021
 */
public class Student {
    public String firstName;
    public String lastName;
    public int cash;
    /**
     @param fName first name of student
     @param lName first name of student
    @param cash Student cash
     */
    public Student (String fName, String lName,int cash)
    {
        firstName= fName;
        lastName=lName;
        this.cash=cash;
    }
    /**get firstname
     * @return firstName field
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     *@param fName set first name of a student
     */
    public void setFirstName(String fName){
        firstName=fName;
    }

    /**get lastname
     * @return lastName field
     */
    public String getLastName(){
        return lastName;
    }
    /**
     *@param lName set last name of a student
     */
    public void setLastNamestName(String lName){
        lastName=lName;
    }
    /**
     *
     * @return cash
     */
    public int getCash() {
        return cash;
    }

    /**
     *
     * @param cash student
     */
    public void setCash(int cash) {
        this.cash = cash;
    }

    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print() {
        System.out.println("Student: "+ firstName+ " "+ lastName +"  Cash: " + cash+"$");
    }


}

