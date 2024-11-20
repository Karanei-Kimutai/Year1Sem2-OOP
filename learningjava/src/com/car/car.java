package com.car;

public class car{
    //Attributes
    private String make;
    private int doors;
    //Constructors
    public car(String make,int doors){
        this.make=make;
        this.doors=doors;
    }
    public void setMake(String make){
        this.make=make;
    }
    public String getMake(){
        return make;
    }
    public void showdetails(){
        System.out.println("Make:"+make);
        System.out.println("Doors:"+doors);
    }

}
