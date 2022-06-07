import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){
        System.out.println("ConsoleExercises");
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer:");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered %d%n " + userInput);
//        System.out.println("enter 3 words: ");
//        for(int i = 0; i< 3; i++){
//            String userInput = scanner.next();
//            System.out.printf("%s%N", userInput);

//        String first;
//        String second;
//        System.out.println("Enter a sentence: ");
//        first = scanner.next() + scanner.nextLine();
//        System.out.println("Please enter another sentence: ");
//        second = scanner.nextLine();
////        System.out.println("First sentence: " + first + "\n second sentence: " + second);
//        System.out.printf("First sentence: %s%n", first);
//        System.out.printf("Second sentence: %s%n", second);
        System.out.println("enter the length of your classroom");
        String length = scanner.nextLine();
        System.out.println("enter the width of your classroom");
        String width = scanner.nextLine();
        int perimeter = (Integer.parseInt(width) + Integer.parseInt(length)) * 2;
        System.out.printf("the perimeter of your classroom is %d%n", perimeter);
    }
}
