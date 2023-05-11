/** Homework-10 LMS
 * Circle деген класс тузунуз, анын PI деген свойствасы, area
 жана circumference деген статик методдору болсун.
 areaны табуу учун: PI * (radius * radius)
 circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат*/
public class Circle {
    public static final double PI=Math.PI;
    private static int radius;
    public Circle (int radius){
        Circle.radius =radius;
    }
    public Circle(){
    }
    public double getPI() {
        return PI;
    }
    public void setRadius(int radius) {
        Circle.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public static double area(){
        double res=PI * (radius * radius);
        System.out.printf("Результат,округленный до тысячных после запятой = %.3f %n",res);
        return res;//точный результат
    }
    public static double circumference(){
        double res=2*PI*radius;
        System.out.printf("Результат,округленный до тысячных после запятой = %.3f %n",res);
        return res;//точный результат

    }
}
