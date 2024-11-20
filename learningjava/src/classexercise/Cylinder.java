package classexercise;

public class Cylinder extends Circle{
    //Attributes
    private int height;
    //Constructor
    public Cylinder(int radius, int height){
        super(radius);
        this.height=height;
    }
    //Area function
    public float area=(float)(2*(22/7)*(getRadius()*getRadius())+(22/7)*(2*getRadius())*height);
    //get methods
    public float getArea(){
        return area;
    }
    //Polymorphism
    @Override
    public float getPerimeter(){
        perimeter=(float)(2*(2*(22/7)*getRadius())+2*height);
        return perimeter;
    }





}
