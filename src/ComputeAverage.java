import java.util.Scanner;

/**
 * Created by frost on 11/19/14.
 */
public class ComputeAverage {
    public static void main(String args[]) {
        double first, second, third, average;

        System.out.println("Enter three numbers: ");

        Scanner input = new Scanner(System.in);

        first = input.nextDouble();
        second = input.nextDouble();
        third = input.nextDouble();

        average = (first + second + third) / 3;

        System.out.println(average);
    }

}
