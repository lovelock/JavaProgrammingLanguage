import java.util.Scanner;

/**
 * Created by frost on 11/19/14.
 */
public class ComputeArea {
    public static void main(String[] args) {
        double radius;
        double area;

//        radius = 20;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for radius");
        radius = input.nextDouble();

        area = radius * radius * 3.1415926;
        System.out.println(area);
    }
}
