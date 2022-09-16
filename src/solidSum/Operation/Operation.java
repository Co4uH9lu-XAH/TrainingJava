package solidSum.Operation;

import solidSum.IO.InputInterface;
import solidSum.IO.PrintInterface;

public class Operation {
    private int a, b, sum;

    public void printRequestA(PrintInterface print){
        print.print("Введите первое число: ");
    }
    public void printRequestB(PrintInterface print){
        print.print("Введите второе число: ");
    }

    public void digitEnterA(InputInterface input){
        a = input.consoleInput();
    }
    public void digitEnterB(InputInterface input) {
        b = input.consoleInput();
    }
    public void calculation(SumInterface sumInterface){
        sum = sumInterface.calculate(a, b);
    }
    public void printResult(PrintInterface print){
        print.print("Сумма двух чисел: ");
        print.print(sum);
    }
}