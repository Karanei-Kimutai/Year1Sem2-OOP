package classexercise;

public abstract class Person {
    //Attributes
    private String name;
    private char gender;
    private int yob;
    private int current_year;

    //Constructor
    public Person(String name,char gender,int yob,int current_year){
        this.name=name;
        this.gender=gender;
        this.yob=yob;
        this.current_year=current_year;
    }
    //Methods
    public final int getAge(){
        int age;
        age=current_year-yob;
        return age;
    }
    public abstract double processLoan();



}
