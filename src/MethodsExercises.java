import java.util.Scanner;

public class MethodsExercises {


    public static int Addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int Division(int num1, int num2) {
        return num1 / num2;
    }

    public static int Modulus(int num1, int num2) {
        return num1 % num2;
    }


    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between 1 and 10: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput < min || userInput > max) {
            getInteger(min, max);
        } else {
            System.out.println(userInput + " is indeed between " + min + " and " + max);
        }
        return userInput;
    }







    public static void main(String[] args) {

        System.out.println(Addition(7, 7));
        System.out.println(Subtraction(7, 7));
        System.out.println(Multiplication(7, 7));
        System.out.println(Division(7, 7));
        System.out.println(Modulus(7, 7));

        getInteger(1,10);


    }

}