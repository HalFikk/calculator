import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int x1;
        int x2;
        int x3;
        char s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��� ����� �����: ");
        x1 = scanner.nextInt();
        x2 = scanner.nextInt();
        System.out.println("������� ������ (+, -, *, /): ");
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
            default:  System.out.println("����������� ������ ������");
            return;
        }
        System.out.println("��� ���������� ���������:");
        System.out.println(x1 + " " + s + " " + x2 + " = " + x3);
        /**
         * ����������� �������� switch ��� ����������.
         * ������ ��� �������� � ����� ��������. ����� �������� ������ �������,
         * �� �� �� �����.
         */
    }
}