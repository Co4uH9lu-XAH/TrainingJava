package Sort.main;

import Sort.sortsAlgoritms.BubbleSortaArray;
import Sort.creating.CreatArray;
import Sort.sortsAlgoritms.SortingArray;

public class Main {

    public static void main(String[] args) {
        SortingArray sortingArray = new BubbleSortaArray();
        sortingArray.sortingArray(new CreatArray().creationArray());
    }
}
