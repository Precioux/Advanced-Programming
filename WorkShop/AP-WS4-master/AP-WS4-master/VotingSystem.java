package com.company;
import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
public class VotingSystem {
  private ArrayList<Voting> Votinglist;
    /**
     * Constructor
     */
   public VotingSystem() {
        Votinglist =new ArrayList<>();
    }

    /**
     *
     * @param Question info
     * @param mode info
     * @param date info
     */
    public void CreateVoting(String Question, int mode, JalaliCalendar date){
        Voting v=new Voting(mode,date,Question);
        Votinglist.add(v);
    }
    /**
     *  printer
     */
    public void printActiveVotings()
    {
        int i=0;
        for (Voting v:Votinglist) {
            System.out.println((i+1)+"- "+v.Question);
            i++;
        }
    }

    /**
     *
     * @param index removing
     */
    public void RemoveVoting(int index)
    {
        Votinglist.remove(index-1);
    }
    public static void main(String[] args) {
      /*  Voter v1=new Voter("Samin","Mahdipour");
        Voter v2=new Voter("Mona","Salighe");
        Voter v3=new Voter("Elnaz","Araban");

        Voting V=new Voting(1,d,"Berim Ordoo?");
        V.createChoice("YES");
        V.createChoice("NO");
        V.vote_1(v1,1);
        V.vote_1(v2,2);
        V.vote_1(v3,1);
        V.pollmaker();
        System.out.println("Next Question: ");
        Voting Vp=new Voting(2,d,"Key berim ordo?");
        Vp.createChoice("Shanbe");
        Vp.createChoice("YekShanbe");
        Vp.createChoice("Doshanbe");
        Vp.vote_2(v1,1,0,1);
        Vp.vote_2(v2,1,1,1);
        Vp.vote_2(v3,0,0,1);
        Vp.pollmaker();
        Vp.Voters();
        int t=Vp.tot;
        System.out.println("Total votes : "+t);*/
        VotingSystem VS=new VotingSystem();
        JalaliCalendar d=new JalaliCalendar(1400,7,28);
        VS.CreateVoting("Berim Ordoo?",1,d);
        VS.CreateVoting("Key Berim Ordoo?",2,d);
        VS.printActiveVotings();
        VS.RemoveVoting(2);
        System.out.println("After Removing :");
        VS.printActiveVotings();
    }
}
