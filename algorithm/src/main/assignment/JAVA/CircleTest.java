package JAVA;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1.gerR()+" "+c1.getArea());
        Circle c2 = new Circle();
        c2.setR(10);
        System.out.println(c2.gerR()+" "+c2.getArea());
    }
}
