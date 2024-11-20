package student;

public class student {
    //Attributes
    private String name;
    private int student_id;
    private int phone_number;
    //Constructors
    public student(String name,int student_id,int phone_number){
        this.name=name;
        this.student_id=student_id;
        this.phone_number=phone_number;
    }
    //constructor overloading
    public student(String name) {
        this.name = name;
    }
    //set methods
    public void setName(String name){
        this.name=name;
    }
    public void setStudent_id(int id){
        student_id=id;
    }
    public void setPhone_number(int number){
        phone_number=number;
    }

    //get methods
    public String getName(){
        return name;
    }
    public int getStudent_id(){
        return student_id;
    }
    public int getPhone_number(){
        return phone_number;
    }
    //Method
    public void showdetails(){
        System.out.println("Name:"+name);
        System.out.println("Phone number:"+phone_number);
        System.out.println("Student id:"+student_id);
    }
}
