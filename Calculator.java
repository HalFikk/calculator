import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int x1;
        int x2;
        int x3;
        char s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");
        x1 = scanner.nextInt();
        x2 = scanner.nextInt();
        System.out.println("Введите символ (+, -, *, /): ");
        s = scanner.next().charAt(0);
        switch(s) {
            case '+': x3 = x1 + x2;
                break;
            case '-': x3 = x1 - x2;
                break;
            case '*': x3 = x1 * x2;
                break;
            case '/': x3 = x1 / x2;
                break;
            default:  System.out.println("Некорректно введен символ");
            return;
        }
        System.out.println("Ваш полученный результат:");
        System.out.println(x1 + " " + s + " " + x2 + " = " + x3);
        /**
         * Использовал оператор switch для вычислений.
         * Сейчас это максимум с моими знаниями. После создания изучил массивы,
         * но не до конца.
         */
    }
}