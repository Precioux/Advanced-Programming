package com.company;
import ir.huri.jcal.JalaliCalendar;
import java.util.*;

/**
 * @author Samin Mahdipour
 * This class defines Voting
 */
public class Voting {
    private int type;
    Random random = new Random();
    private ArrayList<String> ChoiceList;
    private ArrayList<Vote> Votes;
    private ArrayList<Voter> voters;
    private JalaliCalendar date ;
    public String Question;
    private int tot;
    private HashMap<String,HashSet<String>> choices;
    /**
     *
     * @param type info
     * @param date info
     * @param Question info
     */
  public Voting(int type , JalaliCalendar date,String Question) {
        this.date = date;
        this.type = type;
        this.Question = Question;
        choices = new HashMap<>();
        ChoiceList=new ArrayList<>();
        Votes=new ArrayList<>();
        voters=new ArrayList<>();

    }

    /**
     *creates choice
     */
  public void createChoice(String choice)
  {

     ChoiceList.add(choice);
     Vote vote=new Vote(date);
     Votes.add(vote);
      if(type==1)
          System.out.println("If you are ready to vote,Please call vote_1 to continue");
      if(type==2)
          System.out.println("If you are ready to vote,Please call vote_2 to continue");

  }

    /**
     *
     * @param voter info
     * @param ch info
     */
  public void vote_1(Voter voter,int ch)
  {
      if(voters.contains(voter)==false)
          voters.add(voter);
      (Votes.get(ch-1)).AddHashset(voter);
      tot++;
  }

    /**
     *
     * @param voter info
     * @param c1 info
     * @param c2 info
     * @param c3 info
     */
  public void vote_2(Voter voter,int c1,int c2,int c3)
  {
      if(voters.contains(voter)==false)
          voters.add(voter);
      if(c1==1){
       (Votes.get(0)).AddHashset(voter);
      tot++;
      }
      if(c2==1) {
          (Votes.get(1)).AddHashset(voter);
          tot++;
      }
      if(c3==1) {
          (Votes.get(2)).AddHashset(voter);
          tot++;
      }
  }

    /**
     *
     * @param voter random
     */
   public void vote_r(Voter voter)
   {
       int c=(random.nextInt())%2;
       if(voters.contains(voter)==false)
           voters.add(voter);
       (Votes.get(c)).AddHashset(voter);
       tot++;
   }
    /**
     * Voters
     */
  public void Voters()
  {
      int i=0;
      for (Voter v:voters) {
          System.out.println((i+1)+"-"+v.voterInfo());
          i++;
      }
      System.out.println("Total Voters: "+i);
  }

    /**
     *
     * @return total votes
     */
  public int totVot()
  {
      return tot;
  }

    /**
     * makes poll
     */
  public void pollmaker()
  {
      int i=0;
      for (String c:ChoiceList) {
          choices.put(c,(Votes.get(i)).choicers);
      }
      System.out.println(choices);
  }
  /*public static void main(String[] args) {
      Voter v1=new Voter("Samin","Mahdipour");
      Voter v2=new Voter("Mona","Salighe");
      Voter v3=new Voter("Elnaz","Araban");
       JalaliCalendar d=new JalaliCalendar(1400,7,28);
       Voting V=new Voting(1,d,"Berim Ordoo?");
       V.createChoice("YES");
       V.createChoice("NO");
       V.vote_1(v1,1);
       V.vote_1(v2,2);
       V.vote_1(v3,1);
       V.vote_r(v1);
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
       System.out.println("Total votes : "+t);

    }*/
}
