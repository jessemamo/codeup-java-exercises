import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
//        int i = 5;
//        // check the value of the loop control variable
//        while (i <= 15) {
//            System.out.println("This is inside the loop. Before i is incremented though. The value of i is " + i);
//            // modify the loop control variable
//            i = i + 1;
//            System.out.println("This is still inside the loop, but now the loop control variable has incremented. The value of i is now " + i);

//            int i = 2;
//        do {
//            System.out.println("This is inside the loop. Before i is incremented though. The value of i is " + i);
//            // modify the loop control variable
//            i = i + 2;
//            System.out.println("This is still inside the loop, but now the loop control variable has incremented. The value of i is now " + i);
//        } while (i < 100);


//        int i = 100;
//        do {
//            System.out.println("This is inside the loop. Before i is incremented though. The value of i is " + i);
//            // modify the loop control variable
//            i = i - 5;
//            System.out.println("This is still inside the loop, but now the loop control variable has incremented. The value of i is now " + i);
//        } while (i > -10);
//    }
//        }
//        int i = 2;
//        do{
//
//        }
//        int i = 2;
//        do {
//            System.out.println("This is inside the loop. Before i is incremented though. The value of i is " + i);
//            // modify the loop control variable
//            i = i * i;
//            System.out.println("This is still inside the loop, but now the loop control variable has incremented. The value of i is now " + i);
//        } while (i < 65536);
//    }
//}
//        int i;
//        for (i = 5; i < 15; i++){
//            System.out.println("oh hello " + i);
//        }
//        System.out.println("final product " + i);
//
//
//    }
//}
//        int i;
//        for (i = 2; i < 100; i+=2){
//            System.out.println("oh hello " + i);
//        }
//        System.out.println("final product " + i);
//        int i;
//        for (i =100; i > -10; i-=2){
//            System.out.println("oh hello " + i);
//        }
//        System.out.println("final product " + i);
//        int i;
//        for (i =2; i < 65536; i*=i){
//            System.out.println("oh hello " + i);
//        }
//        System.out.println("final product " + i);
//        int i;
//        for(i = 0; i <= 100; i++)
//            if(i % 3 == 0 && i % 5 == 0)
//                System.out.println(i);

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        Scanner sc = new Scanner(System.in);

        boolean anotherGrade = true;

        do {
            System.out.print("Please enter a numerical grade from 0 to 100 ");

            int numericGrade = sc.nextInt();

            if (numericGrade >= 88) {
                System.out.println("A");
            } else if (numericGrade >= 80) {
                System.out.println("B");
            } else if (numericGrade >= 67) {
                System.out.println("C");
            } else if (numericGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.print("Do you wish to enter a new grade? (y/n) ");

            String userResponse = sc.next();

            if (!userResponse.equalsIgnoreCase("y")) {
                anotherGrade = false;
            }

        } while (anotherGrade);



    }
    }

