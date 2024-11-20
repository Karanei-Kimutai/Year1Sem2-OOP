package classexercise;

import java.sql.SQLOutput;

public class Student extends Person{
    //Attributes
    private int numberofcourses;
    public Student(String name,char gender,int yob,int current_year,int numberofcourses){
        super (name,gender,yob,current_year);
        this.numberofcourses=numberofcourses;
    }


    @Override
    public double processLoan(){
        if(getAge()<10){
            System.out.println("Maximum loan:"+ (double)1000);
        } else if (getAge()<=18&&getAge()>=10){
            System.out.println("Maximum loan:"+(double)10000);
        }
        else if(getAge()<=24&&getAge()>18){
            System.out.println("Maximum loan:"+(double)100000);
        }
        else{
            System.out.println("Undefined category");
        }
        return 0;
    }

}
