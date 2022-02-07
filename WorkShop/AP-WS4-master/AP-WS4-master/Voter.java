package com.company;
import java.util.HashSet;
import java.util.Set;
/**
 * @author Samin
 * This class is about Voter Identity
 */
public class Voter {
   private String FName;
    private String LName;

    /**
     *
     * @param FName info
     * @param LName info
     */
    public Voter(String FName,String LName) {
        this.FName = FName;
        this.LName = LName;
    }

    /**
     *
     * @return Fname
     */
   public String getFName() {
        return FName;
    }

    /**
     *
     * @param FName data
     */
    public void setFName(String FName) {
        this.FName = FName;
    }

    /**
     *
     * @return Lname
     */
    public String getLName() {
        return LName;
    }

    /**
     *
     * @param LName data
     */
    public void setLName(String LName) {
        this.LName = LName;
    }
    /**
     *
     * @return voter data
     */
    public String voterInfo()
    {
        return FName+" "+LName;
    }
    /**
     * Prints Vote
     */
    public void print()
    {
        System.out.println(voterInfo());
    }
   /* public static void main(String[] args) {
        Voter v=new Voter("Samin","Mahdipour");
        v.print();
    }*/
}

