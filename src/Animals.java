import java.util.Scanner;

import static java.lang.System.*;

public class Animals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        double height;
        double bmi;
        System.out.print("Your weight (in kilograms): ");
        weight = sc.nextDouble();
        System.out.print("Your height (in meters: ");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.4f%s", bmi, "Normal");
        } else if (bmi < 30.0) {
            System.out.printf("%20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%20.2f%s", bmi, "Obese");
        }
    }

}
