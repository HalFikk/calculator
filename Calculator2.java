import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        int i;
        int num3;
        char symbol;
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[2];
        System.out.print("Введите 2 числа: ");
        for(i = 0; i<number.length; i++){
            i = scanner.nextInt();
        }
        System.out.print("Введите символ для совершения операции ( * , / , + , - ) ");
    }
}
/**
 * Попытался записать введенные целые числа в массив (для тренеровки использования),
 * но так и не удалось этого сделать.
 * Пытался для проверки результата вывести на консоль целые числа записанные в массив, но не смог.
 * Использовал для этого цикл for, не уверен что такое возможно и правильно ли я все делал.
 */