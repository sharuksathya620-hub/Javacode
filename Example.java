public class Example {
    public static void main(String [] args) {
        System.out.println("Program started");
        try{
            int result=10/0;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Number finally block");
        }
        System.out.println("Program Ended");
    } 
}
