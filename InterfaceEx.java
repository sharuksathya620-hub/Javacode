\interface flyable{
    int a=100;
    void fly();

}
interface movable{
    void fly();
}
class Bird implements flyable{
    public void fly(){
        System.out.println("Birds can fly");
    }
}
class Aeroplane implements flyable,movable{
    public void fly(){
        System.out.println("plane can fly");
    }
}
public class InterfaceEx{
    public static void main(String [] args) {
        Bird b=new Bird();
        System.out.println(b.a);
    }
}

