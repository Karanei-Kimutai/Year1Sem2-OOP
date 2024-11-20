package student;

public class object {
    public static void main(String[] args){
        //creating objects
        student karanei=new student("Karanei",183523,717266635);
        student kimutai=new student("Karanei");

        //Using set methods
        kimutai.setStudent_id(183523);
        kimutai.setPhone_number(717266635);

        System.out.println("Name:"+karanei.getName());
        System.out.println("Phone Number:"+karanei.getPhone_number());
        System.out.println("Student id::"+karanei.getStudent_id());

        karanei.showdetails();


    }
}
