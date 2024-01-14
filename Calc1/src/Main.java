import java.util.Scanner;

public class Main {
    public static String calc (String[] input){
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String inputStr = input.nextLine();
        String[] operations = {"+", "-", "/", "*"};
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};


        String oper = inputStr[1];
        int oper1 = 5;
        for (int i = 0; i < operations.length; i++) {
            if (oper.contains(operations[i])) {
                oper1 = i;
                break;
            }
        }
        if (operation == 5) {
            System.out.println("Укажите математическое действие.");
            return;
        }

        int n1 = Integer.parseInt(inputStr[0]), n2 = Integer.parseInt(inputStr[2]);
        int number = 11;
        for (int k = 0; k < numbers.length; k++) {
            if (n1 == numbers[k]) {
                number = k;
                break;
            }
        }
        int number1 = 11;
        for (int j = 0; j < numbers.length; j++) {
            if (n2 == numbers[j]) {
                number1 = j;
                break;
            }
        }
        if (number == 11) {
            System.out.println("Введите числа от 1 до 10.");
            return number;
        }
        if (number1 == 11) {
            System.out.println("Введите числа от 1 до 10.");
            return number1;
        }
        switch (inputStr){
            case "+":
                output = n1+n2;
                System.out.println("Output: " + output);
            case "-":
                output = n1-n2;
                System.out.println("Output: " + output);
            case "*":
                output = n1*n2;
                System.out.println("Output: " + output);
            case "/":
                output = n1/n2;
                System.out.println("Output: " + output);
            default:
                System.out.println("Ни одно из предыдущих условий не подошло...");
        }
    }
}