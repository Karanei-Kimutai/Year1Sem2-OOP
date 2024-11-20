package Interfaces;

public class Main {
    public static void main(String[] args){
        employee employee1=new employee("Karanei",400000,0.3);
        product product1=new product(400,"Chocolate",4);
        System.out.println("Salary:"+employee1.getpayment());
        System.out.println("Cost:"+product1.getpayment());
    }
}
