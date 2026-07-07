abstract class Shape {
    abstract int calculateArea();
}
class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    double calculateArea(){
        return 3.17*radius*radius;
    }
    }
public class Abstraction{
    public static void main(String[] args){
        Circle c=new Circle(radius:6);
        System.out.println(c.calculateArea());
    }
}
