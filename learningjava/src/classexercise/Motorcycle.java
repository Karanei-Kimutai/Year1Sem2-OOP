package classexercise;

public class Motorcycle {
    //Attributes
    private String name;
    private float price;

    //Constructors
    public Motorcycle(String name){
        this.name=name;
    }
    public Motorcycle(String name, float price){
        this.name=name;
        this.price=price;
    }
    //Set method
    public void setPrice(float price){
        this.price=price;
    }
    public void setName(String name){
        this.name=name;
    }
    //Get method
    public float getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    //Other methods
    public void showdetails(){
        System.out.println("Name:"+name);
        System.out.println("Price:"+price);
    }
    public static void bingchilling(){
        System.out.println("Bing Chilling");
    }


}
