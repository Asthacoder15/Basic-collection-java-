
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the year  ");
        Scanner s=new Scanner(System.in);
        int y=s.nextInt();
        if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                  System.out.println("This is leap yr ");  
                }
                else{
                   System.out.println("This is not leap yr "); 
                }
                
            }else{
                System.out.println("This is leap yr ");
            }
            
        }else{
            System.out.println("This is not leap yr ");
        }
    }
}
