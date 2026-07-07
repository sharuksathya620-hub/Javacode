public class Rampex {
    public static void main(String [] args) {
        System.out.println("Program started");
        try{
            int result=10/0;
            System.out.println(result);
            int[] arr={1,2,3,4,5};
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Number finally block");
        }
        System.out.println("Program Ended");
    } 
}
