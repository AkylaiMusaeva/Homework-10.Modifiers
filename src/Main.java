
import java.rmi.StubNotFoundException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /**Homework-10 LMS*/
        Circle circle=new Circle(4);
        System.out.println("Площадь круга равна "+Circle.area());
        System.out.println("Длина окружности равна "+Circle.circumference());


    }
}