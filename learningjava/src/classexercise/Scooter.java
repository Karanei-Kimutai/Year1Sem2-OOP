package classexercise;

public class Scooter extends Motorcycle{
    //Attributes
    private int wheels;
    //Constructor
    public Scooter(String name,float price,int wheels){
        //Call the parent class constructor
        super(name,price);
        this.wheels=wheels;
    }
    //Polymorphism
    @Override
    public void showdetails(){
        System.out.println("Name:"+getName());
        System.out.println("Price:"+getPrice());
        System.out.println("Wheels:"+wheels);
    }
}
