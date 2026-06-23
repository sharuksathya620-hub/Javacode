import java.util.*;
public class Triangle {
    public static void main(String [] arge){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        for(int i=1;i<=a;i=i+2){
            for(int j=a-i;j>=0;j--){
                System.out.print(" ");
        }for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
       System.out.println();
        }
        
    }
}
    