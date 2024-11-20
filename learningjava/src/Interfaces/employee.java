package Interfaces;

public class employee implements Payment{
    //Attributes
    private String name;
    private double gross_salary;
    private double tax;

    //Constructor
    public employee(String name,double gross_salary,double tax){
        this.name=name;
        this.gross_salary=gross_salary;
        this.tax=tax;
    }
    @Override
    public double getpayment(){
     double net_salary=gross_salary*tax;
     return net_salary;
    }

}
