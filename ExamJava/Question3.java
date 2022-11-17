package ExamJava;

class Shape{
    void Draw(){
        System.out.println("Shape Draw");
    }
    void Erase(){
        System.out.println("Shape Erase");
    }
}
class Circle extends Shape{
    void Draw(){
        System.out.println("Circle Draw");
    }
    void Erase(){
        System.out.println("Circle Erase");
    }
}
class Triangle extends Shape{
    void Draw(){
        System.out.println("Triangle Draw");
    }
    void Erase(){
        System.out.println("Triangle Erase");
    }
}
class Square extends Shape{
    void Draw(){
        System.out.println("Square Draw");
    }
    void Erase(){
        System.out.println("Square Erase");
    }
}
public class Question3 {
    public static void main(String[] args) {
        Shape sha =new Shape();
        Circle cir=new Circle();
        Triangle tri =new Triangle();
        Square squ = new Square();
        System.out.println("Runtime polymorphism :");
        System.out.println("When sha object created from class Shape:");
        sha.Draw();
        sha.Erase();
        System.out.println("When cir object created from class Circle:");
        cir.Draw();
        cir.Erase();
        System.out.println("When tri object created from class Triangle:");
        tri.Draw();
        tri.Erase();
        System.out.println("When squ object created from class Square:");
        squ.Draw();
        squ.Erase();

    }
}
