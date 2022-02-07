package com.company;
/**
 * This class is about Labs' data
 * for AP Workshop-session 2
 * @author Samin Mahdipour
 * @since 10.2.2021
 */
public class Lab {
    private Student[] students;
    private float avg;
    private String day;
    private int capacity;
    private int currentSize;

    /** Constructors
     * @param capacity for capacity
     * @param day   for day
     */
    public Lab(int capacity, String day) {
        this.capacity = capacity;
        this.day = day;
        currentSize=0;
        students= new Student[capacity];
    }

    /** Method
     * get Capacity
     *
     * @return capacity field
     */
    public int getCapacity() {
        return capacity;
    }
    /**
     *@param capacity setter
     */
    public void setCapacity(int capacity){

        this.capacity=capacity;
    }

    /**
     *getter
     * @return day
     */
    public String getDay () {

        return day;
    }

    /**
     *
     * @param day setter
     */
    public void setDay(String day)
    {

        this.day=day;
    }

    /**
     * getter
     * @return students
     */
    public Student[] getStudents() {

        return students;
    }

    /**
     *
     * @param students setter
     */
    public void setStudents(Student[] students) {

        this.students = students;
    }

    /**
     *
     * @return avg getter
     */
    public float getAvg() {
        return avg;
    }

    /**
     * Average calculator
     */
    public void calculateAvg () {
        float tot=0;
        for(int j=0;j<currentSize;j++)
            tot=tot+students[j].grade;
        avg=tot/currentSize;
        System.out.println("Average: "+avg);
    }
    /**
     *
     * @param std getter
     */
    public void enrollStudent(Student std) {
     //   System.out.println("CurrentSize "+currentSize+"\n"+"Capacity " +capacity);
        //  if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
   //     } else {
     //       System.out.println("Lab is full!!!");
       // }
    }

    /**
     * print lab data
     */
        public void print () {

        for(int i=0;i<currentSize;i++)
            students[i].print();
        calculateAvg();
        }

}