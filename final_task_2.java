import java.util.Scanner;

public class final_task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение в формате 'ax + b = c': ");
        String equation = scanner.nextLine();

        char[] equationArray = equation.toCharArray();

        int a = 0, b = 0, c = 0;
        char operation1 = '+', operation2 = '+';

        if (equationArray[0] != 'x') {
            a = Character.getNumericValue(equationArray[0]);
        } else {
            operation1 = '-';
        }

        if (equationArray[4] != 'x') {
            c = Character.getNumericValue(equationArray[4]);
        } else {
            operation2 = '-';
        }

        b = Character.getNumericValue(equationArray[2]);

        int x;

        if (equationArray[0] == 'x') {
            x = calculateX(b, c, operation2);
        } else if (equationArray[2] == 'x') {
            x = calculateX(a, c, operation1);
        } else {
            x = calculateX(a, b, operation1);
        }

        System.out.println("Значение x: " + x);
    }

    private static int calculateX(int a, int b, char operation) {
        if (operation == '+') {
            return b - a;
        } else {
            return a - b;
        }
    }
}