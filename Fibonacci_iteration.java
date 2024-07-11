
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        
        int t1=0;
        int t2=1;
        System.out.println(t1);
        System.out.println(t2);
        for(int i=1;i<=k-2;i++){
            int temp =t2;
            t2=t1+t2;
            t1=temp;
            System.out.println(t2);
            
        }
    }
}
