package solidSum.IO;

import java.util.Scanner;

public class Input implements InputInterface {
    private final Scanner scanner;

    public Input(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public int consoleInput(){
        return scanner.nextInt();
    }
}
