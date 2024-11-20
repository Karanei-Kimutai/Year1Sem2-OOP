package classexercise.interfaces;

public class Course implements Span {
    //Attributes
    private String coursename;
    private int coursecode;
    private int totalhours;
    //Constructor
    public Course(String coursename, int coursecode, int totalhours) {
        this.coursename = coursename;
        this.coursecode = coursecode;
        this.totalhours = totalhours;
    }
    //Methods
    public int getTotalhours(){
        return totalhours;
    }

    @Override
    public int courseduration(){
        int duration=getTotalhours()/(365*24);
        return duration;
    }


}
