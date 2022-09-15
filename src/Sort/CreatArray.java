package Sort;

import java.util.Random;

public class CreatArray implements CreationArray{

    @Override
    public int[] creationArray() {
        int [] array = new int[10];
        Random random = new Random();
        for (int i = 0; i<array.length; i++){
            array[i] = random.nextInt(20);
            System.out.print(array[i]+" ");
        }
        return array;
    }
}
