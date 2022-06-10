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


    public static long CalculateFactorial() {
        System.out.print("Enter a number between 1 and 10: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 1 || num > 10) CalculateFactorial();

        System.out.println("Would you like to continue? Y or N");

        String userResponse = sc.next();

        if (userResponse.equalsIgnoreCase("Y")) {
            long factorial = 1;
            for (var i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
            return factorial;
        } else if (userResponse.equalsIgnoreCase("N")){
            System.out.println("OK! Exiting program");
        }
        return 0;
    }

    public static void DiceRoll() {
        System.out.println("Enter the number of sides for a pair of dice.");
        Scanner sc = new Scanner(System.in);
        int diceSides = sc.nextInt();
        int roll1 = 0;
        int roll2 = 0;
        System.out.println("Press enter to roll a dice");
        Scanner sc2 = new Scanner(System.in);
        String readString = sc2.nextLine();
        while(readString != null) {
            if (readString.equals("")) {
                roll1 = (int) (Math.random() * diceSides) + 1;
                roll2 = (int) (Math.random() * diceSides) + 1;

                System.out.println("You rolled a " + (roll1 + roll2) + "!");

                System.out.println("Would you like to roll again?");
                String userResponse = sc.next();

                if (userResponse.equalsIgnoreCase("Y")) {
                    DiceRoll();
                } else if (userResponse.equalsIgnoreCase("N")){
                    System.out.println("OK! Exiting program");
                    break;
                }
            }
            if (sc2.hasNextLine()) {
                readString = sc2.nextLine();
            } else {
                readString = null;
            }
        }
    }


    public static void main(String[] args) {

        System.out.println(Addition(7, 7));
        System.out.println(Subtraction(7, 7));
        System.out.println(Multiplication(7, 7));
        System.out.println(Division(7, 7));
        System.out.println(Modulus(7, 7));

        getInteger(1,10);

        CalculateFactorial();
        DiceRoll();


    }

}