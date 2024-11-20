package classexercise.interfaces;

public class Main {
    public static void main(String[] args){
        student student1=new student("Bing Chilling",8);
        Course course1=new Course("Computer Science",1000,2400);

        System.out.println("Student life span:"+student1.courseduration());
        System.out.println("Course life span:"+course1.courseduration());
    }
}
