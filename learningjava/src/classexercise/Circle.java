package classexercise;

public class Circle {
    //Attributes
    private int radius;



    //Constructor
    public Circle(int radius){
        this.radius=radius;
    }
    //set methods
    public void setRadius(int radius){
        this.radius=radius;
    }
    public float perimeter=(float)(22/7)*(2*radius);
    //get methods
    public int getRadius(){
        return radius;
    }
    public float getPerimeter(){
        return perimeter;
    }


}
