import java.util.Scanner;

public class HighLow {

    public static int RNG() {
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void Prompt(int rand) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pick a number between 1 and 100");
        int userNum = sc.nextInt();

        System.out.println("You picked " + userNum);

        if (userNum < rand) {
            System.out.println("HIGHER");
            Prompt(rand);
        } else if (userNum > rand) {
            System.out.println("LOWER");
            Prompt(rand);
        } else {
            System.out.println("GOOD GUESS!");
        }
    }

    public static void main(String[] args) {

        int rand = RNG();

        Prompt(rand);

    }

}
