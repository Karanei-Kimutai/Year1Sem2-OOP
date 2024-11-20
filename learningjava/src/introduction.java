public class introduction {
    public static void main(String[] args){
        //single line comments
        /*Multi line comments */

        //variables
        int x=3,y=4,z;
        double rate;
        float decimal;
        char a='a';
        char name;


        //selection control structures, if....else if...else ifp, switch statement
        if(x>y){
            z=x;
        }
        else if(y>x){
            z=y;
        }
        else{
            z=x;
        }

        switch(z){
            case 3:
                System.out.print("Damn ok\n");
                break;
            case 4:
                System.out.print("Ooh...aight");
                break;
            default:
                System.out.print("Bing Chilling");
        }

        //repetition control structures: for loop, while loop, do...while loop
        int i;
        for(i=0;i<5;i++){
            System.out.println("I'm learning Java");
        }
        int j=0;
        while(j<5){
            System.out.println("Another loop over here");
            j++;
        }
        int k=0;
        do {
            System.out.println("This is a do...while loop");
            k++;
        } while (k<5);

        System.out.printf("%d",30);

    }
}
