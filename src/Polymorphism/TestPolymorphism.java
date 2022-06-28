package Polymorphism;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Tue, 6/28/2022
 * Time     : 14:44
 * Filename : TestPolymorphism
 */
public class TestPolymorphism {
    public static void Test(){
        Shape shape;
        shape = new Square();
        shape.info();
        shape.draw();
        shape=new Circle();
        shape.info();
        shape.draw();
    }
}
