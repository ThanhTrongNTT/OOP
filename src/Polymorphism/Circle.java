package Polymorphism;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Tue, 6/28/2022
 * Time     : 14:43
 * Filename : Circle
 */
public class Circle extends Shape{
    @Override
    void info(){
        System.out.println("This is Circle!!");
    }
    @Override
    void draw(){
        System.out.println("Drawing Circle!!");
    }
}
