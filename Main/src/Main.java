import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("weight in kilograms: ");
        int weight = scanner.nextInt();

        System.out.print("height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);



        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 25) {
            System.out.println("You have a normal weight.");
        } else if (bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        scanner.close();
    }
}