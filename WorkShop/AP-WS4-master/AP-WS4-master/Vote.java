package com.company;
import ir.huri.jcal.JalaliCalendar;
import java.util.*;
/**
 * @author Samin
 * This class is about Votes Data
 */
public class Vote {
    private Voter voter;
    private JalaliCalendar date ;
    public HashSet<String> choicers ;
    /**
     *
     * @param date data
     */
    public Vote( JalaliCalendar date) {

        this.date = date;
        choicers = new HashSet<>();
    }

    /**
     *
     * @return date
     */
    public JalaliCalendar getDate() {
        return date;
    }
    /**
     *
     * @param date data
     */
    public void setDate(JalaliCalendar date) {
        this.date = date;
    }

    /**
     *
     * @return voter
     */

    public String voteInfo()
    {
        return "Date: "+date;
    }
    /**
     * Prints Vote
     */
    public void print(){
        System.out.println(voteInfo());
    }

    /**
     * This method prints Hashset
     */
    public void printHashset(){
        System.out.print("Voters : ");
        System.out.println(choicers);}
    /**
     *
     * @param voter adding
     */
    public void AddHashset(Voter voter) {

        choicers.add(voter.voterInfo());
    }

    /**
     *
     * @param voter removing
     */
    public void removeHashset(Voter voter)
    {
        choicers.remove(voter.voterInfo());
    }
  /* public static void main(String[] args) {
        Voter v1=new Voter("Samin","Mahdipour");
        Voter v2=new Voter("Mona","Salighe");
        Voter v3=new Voter("Elnaz","Araban");
        JalaliCalendar d=new JalaliCalendar(1400,7,28);
        Vote Ordo = new Vote(d);
        Ordo.AddHashset(v2);
        Ordo.AddHashset(v1);
        Ordo.AddHashset(v3);
        Ordo.removeHashset(v3);
        Ordo.print();
        Ordo.printHashset();
   }*/
}
