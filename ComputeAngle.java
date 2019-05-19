package computeangle;

import java.util.Scanner;

public class ComputeAngle {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        double x1, y1, x2, y2, x3, y3, sideA, sideB, sideC, angleA, angleB, angleC;

        System.out.println("Enter 3 points with 2 coordinates:");

        x1 = reader.nextDouble();
        y1 = reader.nextDouble();
        x2 = reader.nextDouble();
        y2 = reader.nextDouble();
        x3 = reader.nextDouble();
        y3 = reader.nextDouble();

        sideA = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        sideB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        sideC = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        angleA = Math.toDegrees(Math.acos(((Math.pow(sideA, 2) - Math.pow(sideB, 2)) - Math.pow(sideC, 2)) / (-2 * sideB * sideC)));
        angleB = Math.toDegrees(Math.acos(((Math.pow(sideB, 2) - Math.pow(sideA, 2)) - Math.pow(sideC, 2)) / (-2 * sideA * sideC)));
        angleC = Math.toDegrees(Math.acos(((Math.pow(sideC, 2) - Math.pow(sideB, 2)) - Math.pow(sideA, 2)) / (-2 * sideB * sideA)));

        System.out.printf("\nThe three angles are: %.2f\t%.2f\t%.2f\n\n", Math.round(angleA * 100) / 100.0, Math.round(angleB * 100) / 100.0, Math.round(angleC * 100) / 100.0);

        /*
         The following code rounds the second decimal place of a floating point number itself.
         System.out.printf("\nThe three angles are: %.2f\t%.2f\t%.2f\n\n", angleA, angleB, angleC);
         */
    }

}
