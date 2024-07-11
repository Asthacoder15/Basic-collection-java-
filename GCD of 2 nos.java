import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number 1 ");
        Scanner s=new Scanner(System.in);
        int y=s.nextInt();
        System.out.println("Enter the number 2 ");
        
        int t=s.nextInt();
        while (y!=t){
            if(y>t){
                y=y-t;
            }
            else{
                t=t-y;
            }
        }
        System.out.println("GCD OF TWO NUMBERS IS"+y);
       
    }
}
