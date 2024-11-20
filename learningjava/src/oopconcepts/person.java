package oopconcepts;

public class person {
    //Define attributes
    private String name;
    private char gender;
    private int yob;

    //Define constructors-Used to initialize attributes of a class
    public person(String name){
       this.name=name;
    }
    public person(String name,char gender,int yob){
        this.name=name;
        this.gender=gender;
        this.yob=yob;
    }

    //Define set methods
    public void setName(String name){
        this.name=name;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public void setYob(int yob){
        this.yob=yob;
    }

    //Define get methods
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getYob(){
        return yob;
    }

    //Other methods
    public int computeage(){
        //getage
        int age;
        age=2024-yob;
        return age;
    }
    public void showdetails(){
        //print all attributes
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("YOB:"+yob);
    }
}
