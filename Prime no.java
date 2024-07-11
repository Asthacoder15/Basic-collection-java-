import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number  ");
        Scanner s=new Scanner(System.in);
        int y=s.nextInt();
        int c=0;
        for(int i=1;i<=y;i++){
            if(y%i==0){
                c=c+1;
            }
        }
        if(c==2){
            System.out.println("The number is prime number ");
        }
        else{
            System.out.println("The number is not  prime number ");
        }
    }
}
