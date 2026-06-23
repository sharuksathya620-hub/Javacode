import java.util.*;
public class Downward {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int a=input.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=0;j<=i;++j){
                System.out.print(" ");
            }
            for(int k=a;k>=i;k--){
                System.out.print(" * ");

            }
            System.out.println();
            }
        }

    }
    
