import java.util.Scanner;

public class Main {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

// I want to limit InputA and InputB to the numbers asked


        while (true) {
            System.out.print("Enter a number between 1 and 22: ");
            int inputA = stdin.nextInt();

            System.out.print("Enter a second number between 1 and 14: ");
            int inputB = stdin.nextInt();

            int calculation = (3 * inputA) + (2 * inputB) + (4 / inputB);


            if (calculation > 100) {
                System.out.println("Limit Exceeded");
            } else {
                System.out.println("The calculation is " + calculation);
            }
        }
    }
}