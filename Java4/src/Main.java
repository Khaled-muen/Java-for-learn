import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Car c1 =new Car();
        // c1.setColor("Blue");
        // Engine e1=new Engine("germany",135);
        // c1.setMyEngine(e1);
        // System.out.println( c1.getMyEngine().getType());
        // System.out.println(c1.getColor());
        // Engine e2 =new Engine("rashian", 250);
        // Car c2 =new Car("red", "2025", 4, e2);
        // System.out.println(c2.getMyEngine().getType());

        House h1=new House();
        h1.getRoom().setHeight(5);
        h1.getRoom().setWidth(5);
        System.out.println(h1.getRoom().getWidth()*h1.getRoom().getHeight());        
    }
}
