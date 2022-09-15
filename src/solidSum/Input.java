package solidSum;

import java.util.Scanner;

public class Input implements InputInterface{

    @Override
    public int input(Scanner scanner){
        return scanner.nextInt();
    }
}
