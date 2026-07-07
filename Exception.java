public class Exception {
    public static void main(String[] args) {
        System.out.println("Program started");
        try{
            int result=10/0;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Number was Divided by zero");
        }
        System.out.println("Program Ended");
    }
    
}
