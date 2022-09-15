package solidSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sum sum = new Sum();
        Print print = new Print();
        Input input = new Input();

        print.print("Введите первое число: ");
        int a = input.input(scanner);
        print.print("Введите второе число: ");
        int b = input.input(scanner);
        print.print("Сумма: " + sum.calculate(a, b));
    }
}