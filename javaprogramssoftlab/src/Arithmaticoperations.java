import java.util.Scanner;
public class Arithmaticoperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter second number: ");
        int num2 = in.nextInt();

        int sum = num1 +num2 ;
        int difference = num1-num2;
        int product = num1 * num2 ;
        int quotient = num1 / num2;
        int modulo = num1 % num2;


        System.out.println("sum :"  +sum);
        System.out.println("Difference : " +difference);
        System.out.println("product :" +product);
        System.out.println("quotient :" +quotient);
        System.out.println("modulo :" +modulo);

    }
}
