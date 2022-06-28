package Inheritance;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Tue, 6/28/2022
 * Time     : 14:32
 * Filename : TestInheritance
 */
public class TestInheritance {
    public static void test(){
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println("---Dog---");
        dog.woof();
        dog.eat();
        dog.sleep();
        System.out.println("---Cat---");
        cat.meow();
        cat.eat();
        cat.sleep();
    }
}
