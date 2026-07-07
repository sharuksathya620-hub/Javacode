class First{
    int x=10;
}
class Second extends First{
    void example(){
        System.out.println("Frist value: ")
    }
}
public class Oops {
    public static void main(String [] args){
        First value=new First();
        example result=new example();
        System.out.println(value.x);
    }
}
