

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("input 1st integer: ");
        num1 = scan.nextInt();
        System.out.print("input 2nd integer: ");
        num2 = scan.nextInt();

        int operator ;
        double answer = 0;
        System.out.println("Enter operator: ");
        System.out.println("1.+ ");
        System.out.println("2.- ");
        System.out.println("3.* ");
        System.out.println("4.% ");
        operator = scan.nextInt();
        switch (operator) {
            case 1:
                answer = num1 + num2;
                break;
                case 2:
                    answer = num1 - num2;
                    break;
                    case 3:
                        answer = num1 * num2;
                        break;
                        case 4:
                            answer = num1 / num2;
                            break;
        }
        System.out.println("Answer: " + answer);

    }
}
