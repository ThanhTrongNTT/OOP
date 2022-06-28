import Abstraction.TestAbstraction;
import Inheritance.TestInheritance;
import Polymorphism.TestPolymorphism;

/**
 * Create by: IntelliJ IDEA
 * User     : ${USER}
 * Date     : ${DAY_NAME_SHORT}, ${DATE}
 * Time     : ${TIME}
 * Filename : ${NAME}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---Encapsulation---");
        EncapsulationExercise.Exercise();
        System.out.println("---inheritance---");
        TestInheritance.Test();
        System.out.println("---Polymorphism---");
        TestPolymorphism.Test();
        System.out.println("---Abstraction---");
        TestAbstraction.Exercise();
    }
}