import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        int i;
        int num3;
        char symbol;
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[2];
        System.out.print("������� 2 �����: ");
        for(i = 0; i<number.length; i++){
            i = scanner.nextInt();
        }
        System.out.print("������� ������ ��� ���������� �������� ( * , / , + , - ) ");
    }
}
/**
 * ��������� �������� ��������� ����� ����� � ������ (��� ���������� �������������),
 * �� ��� � �� ������� ����� �������.
 * ������� ��� �������� ���������� ������� �� ������� ����� ����� ���������� � ������, �� �� ����.
 * ����������� ��� ����� ���� for, �� ������ ��� ����� �������� � ��������� �� � ��� �����.
 */