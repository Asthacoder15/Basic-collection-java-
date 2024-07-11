
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int temp=1;
        for(int i=1;i<=k;i++){
             temp =i*temp;
        }
        System.out.println(temp);
    }
}
