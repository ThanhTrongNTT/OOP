package Polymorphism;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Tue, 6/28/2022
 * Time     : 14:42
 * Filename : Square
 */
public class Square extends Shape{

    @Override
    void info(){
        System.out.println("This is Square!");
    }
    @Override
    void draw(){
        System.out.println("Drawing Square...");
    }
}
