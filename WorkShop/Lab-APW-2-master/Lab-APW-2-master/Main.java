package com.company;
/**
 * This Project is creating Virtual Lab
 * for AP Workshop-session 2
 * @author Samin Mahdipour
 * @since 10.2.2021
 */
public class Main {

    public static void main(String[] args) {
      /*  Student std1=new Student("Ehsan","Edalat","9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();
    }
       */
   Lab workshop1= new Lab(5, "Saturday");
        Student std1=new Student("Ehsan","Edalat","9031066");
        std1.setGrade(20);
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        std2.setGrade(15);
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        std3.setGrade(10);
        workshop1.enrollStudent(std1);
        workshop1.enrollStudent(std2);
        workshop1.enrollStudent(std3);
        workshop1.print();
}
}
