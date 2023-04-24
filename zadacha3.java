import java.util.Scanner;
import java.util.Stack;

public class zadacha3 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        int num1;
        int num2;
        int ans;
        char op;
        int b;

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = reader.nextInt();
        System.out.print("Введите второе число: ");
        num2 = reader.nextInt();
        System.out.print("\nВведите оперцию (+, -, *, /): ");
        op = reader.next().charAt(0);

        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Ошибка операции");
                return;
        }
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);

        stack.push(ans);

        while (true) {
            
                System.out.print("\nВведите оперцию (+, -, *, /,\"n\", если хотите удалить последний результат): ");
                op = reader.next().charAt(0);
                switch(op) {
                    case '+':   System.out.print("Введите число: ");
                                b = reader.nextInt();
                                ans = ans + b;
                        break;
                    case '-':   System.out.print("Введите число: ");
                                b = reader.nextInt();
                                ans = ans - b;
                        break;
                    case '*':   System.out.print("Введите число: ");
                                b = reader.nextInt();
                                ans = ans * b;
                        break;
                    case '/':   System.out.print("Введите число: ");
                                b = reader.nextInt();
                                ans = ans / b;
                        break;
                    case 'n':   System.out.println("удаленное значение: " + stack.pop());
                                ans = stack.peek();
                                System.out.println("Текущее значение: " + ans);
                        break;
                    default:  System.out.printf("Ошибка операции");
                        return;
                }
                stack.push(ans);
                System.out.printf("Ответ = " + ans);
            }
    }
} 

