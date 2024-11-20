package oopconcepts;

public class Main {
    public static void main(String[] args){
        person object1=new person("Karanei");
        person object2=new person("KaraneiKimutai",'M',2006);

        //Using set methods to assign values to other attributes of object1
        object1.setGender('M');
        object1.setYob(2006);

        //Using get methods to retrieve values
        System.out.println("Name:"+object1.getName());
        System.out.println("Gender:"+object1.getGender());
        System.out.println("YOB:"+object1.getYob());
        System.out.println("Age:"+object1.computeage());









    }
}
