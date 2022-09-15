package Sort;

public class BubbleSortaArray implements SortingArray{

    @Override
    public int[] sortingArray(int[] array) {
        System.out.println("");

        for (int i=0; i< array.length-1; i++){
            for (int j = 0; j< array.length-i-1; j++){
                int temp;
                if (array[j]>array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        return array;
    }
}
