package solidSum.main;

import solidSum.IO.Input;
import solidSum.IO.InputInterface;
import solidSum.IO.Print;
import solidSum.IO.PrintInterface;
import solidSum.Operation.Operation;
import solidSum.Operation.Sum;
import solidSum.Operation.SumInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumInterface sum = new Sum();
        PrintInterface print = new Print();
        InputInterface input = new Input(scanner);
        Operation operation = new Operation();

        operation.printRequestA(print);
        operation.digitEnterA(input);
        operation.printRequestB(print);
        operation.digitEnterB(input);
        operation.calculation(sum);
        operation.printResult(print);
        
    }
}