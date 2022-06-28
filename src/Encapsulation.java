/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Tue, 6/28/2022
 * Time     : 14:17
 * Filename : Encapsualation
 */

// Khởi tạo class Encapsulation
public class Encapsulation {
    // Khai báo các biến là private
    private String name;
    private Integer birthYear;

    public Encapsulation(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }
}
class EncapsulationExercise{
    public static void Exercise(){
        // Khi tạo một đối tượng mới
        // Để truy cập được vào các biến private chỉ có thể dùng các phương thức getter và setter.
        Encapsulation obj1 = new Encapsulation();
        obj1.setName("Trong");
        obj1.setBirthYear(2001);
        System.out.println(obj1.getName() +", "+obj1.getBirthYear());
    }
}
