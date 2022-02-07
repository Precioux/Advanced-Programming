package com.company;

/**
 * This class is about Students' data
 * for AP Workshop-session 2
 * @author Samin Mahdipour
 * @since 10.2.2021
 */
public class Student {
        public String firstName;
        public String lastName;
        public String id;
        public int grade;
        /**
         @param fName first name of student
         @param lName first name of student
         @param sID Student ID
         */
        public Student (String fName, String lName,String sID)
        {
            firstName= fName;
            lastName=lName;
            id=sID;
            grade = 0;
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
         * get ID
         * @return id field
         */
        public String getId(){
            return id;
        }
        /**
         *@param sID set id of a student
         */
        public void setid(String sID){
            id=sID;
        }
        /**
         * get grade
         * @return grade field
         */
        public int getGrade(){

            return grade;
        }
        /**
         *@param grade set grade of a student
         */
    public void setGrade(int grade) {
        this.grade = grade;
    }
    /**
         * Print the student’s last name and ID number to the output terminal.
         */
        public void print() {
            System.out.println("Student: "+ firstName+ " "+ lastName + ", student ID: " + id + ", grade: " + grade);
        }


}
