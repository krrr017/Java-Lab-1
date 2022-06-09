import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] arges) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Imput a number");
        int number = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", number, i, (number * i));
        }
        scan.close();
    }
}