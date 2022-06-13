package util;

import java.util.Scanner;


public class Input {
    private Scanner scanner;

    public String getString() {
        System.out.println("Enter a string");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public Input() {
        this.scanner = new Scanner(System.in);

    }
    public boolean yesNo() {
        String userDecision;
        boolean userYesOrNo;
        System.out.println("Enter a boolean decision. Y or N");
        userDecision = scanner.nextLine();
        if (userDecision.equalsIgnoreCase("y")) {
            userYesOrNo = true;
        } else {
            userYesOrNo = false;
        }
        return userYesOrNo;
    }

}
