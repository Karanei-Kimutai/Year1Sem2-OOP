package Interfaces;

public class product implements Payment{
    //Attributes
    private String item_name;
    private double unit_price;
    private int quantity;

    //Constructor

    public product(double unit_price, String item_name, int quantity) {
        this.unit_price = unit_price;
        this.item_name = item_name;
        this.quantity = quantity;
    }

    @Override
    public double getpayment(){
        double price=quantity*unit_price;
        return price;
    }
}
