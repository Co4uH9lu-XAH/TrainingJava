package solidSum.IO;

public class Print implements PrintInterface {

    @Override
    public void print(String string){
        System.out.print(string);
    }

    @Override
    public void print (int sum){
        System.out.println(sum);
    }
}
