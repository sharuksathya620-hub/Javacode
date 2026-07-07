public class WrapperClassEx{
    public static void main(String [] args){
        int n=100;
        Integer i=Integer.valueOf(n);
        i=200;
        int a=i.intValue();
        int b=i;
        
    }
}