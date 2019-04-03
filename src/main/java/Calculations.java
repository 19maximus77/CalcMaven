import java.util.Scanner;

public class Calculations {

    public void CalcIt() {

        String firstNum = "", secondNum = "", operation = "", exit = "";
        boolean flag = true;
        Scanner input = new Scanner(System.in);

        do {

            while (flag) {
                System.out.println("Please enter your first number:");
                firstNum = input.nextLine();
                if (CheckNum.checkNum(firstNum)) {
                    flag = false;
                }
            }
            flag = true;

            while (flag) {
                System.out.println("Please enter your second number:");
                secondNum = input.nextLine();
                if (CheckNum.checkNum(secondNum)) {
                    flag = false;
                }
            }
            flag = true;

            while (flag) {
                System.out.println("Select your Action:");
                operation = input.next();
                if (CheckOperation.checkOperation(operation)) {
                    flag = false;
                }
            }
            flag = true;

            if (operation.equals("+")) {
                System.out.println("Result is: " + (Double.parseDouble(firstNum) + Double.parseDouble(secondNum)));
            }
            if (operation.equals("-")) {
                System.out.println("Result is: " + (Double.parseDouble(firstNum) - Double.parseDouble(secondNum)));
            }
            if (operation.equals("*")) {
                System.out.println("Result is: " + ((Double.parseDouble(firstNum) * Double.parseDouble(secondNum))));
            }
            if (operation.equals("/")) {
                if (Double.parseDouble(secondNum) == 0) {
                    System.out.println("Your input is Invalid! Division by ZERO!");
                } else
                    System.out.println("Result is: " + (Double.parseDouble(firstNum) / Double.parseDouble(secondNum)));
            }

            System.out.println("Do You wish to perfom any other operation? Make Your choise: y / n ");
            exit = input.next();
            input.nextLine();

        } while (exit.equals("y"));
    }
}

