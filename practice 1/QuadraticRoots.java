import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        double D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println(" Discriminant is negative. No real roots.");
        } else {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }
    }
}
