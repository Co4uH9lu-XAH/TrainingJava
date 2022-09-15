package solidSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumInterface sum = new Sum();
        PrintInterface print = new Print();
        InputInterface input = new Input();

        print.print("Введите первое число: ");
        int a = input.input(scanner);
        print.print("Введите второе число: ");
        int b = input.input(scanner);
        print.print("Сумма: " + sum.calculate(a, b));
    }
}