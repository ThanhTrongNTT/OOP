package Abstraction;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Tue, 6/28/2022
 * Time     : 14:50
 * Filename : TestAbtraction
 */
public class TestAbstraction {
    public static void exercise(){
        System.out.println("---Dog Sound---");
        Dog dog = new Dog();
        dog.showSound();
        System.out.println("---Cat Sound---");
        Cat cat = new Cat();
        cat.showSound();
    }
}
