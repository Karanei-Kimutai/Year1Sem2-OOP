package classexercise.interfaces;

public class student implements Span {
    //Attributes
    private String name;
    private int numberofcourses;
    private final int courseduration=3;
    //Constructor
    public student(String name, int numberofcourses) {
        this.name = name;
        this.numberofcourses = numberofcourses;
    }
    @Override
    public int courseduration(){
        int duration=(numberofcourses*courseduration)/12;
        return duration;
    }



}
