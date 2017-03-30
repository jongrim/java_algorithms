/**
 * Created by jgrim on 3/30/17.
 */
import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort (int[] toSort) {
        for (int i = 0; i < toSort.length; i++) {
            int min = getMinimum(Arrays.copyOfRange(toSort, i, toSort.length));
            swap(toSort, i, (min + i));
        }
    }

    public static int getMinimum (int[] toSearch) {
        int min = toSearch[0];
        int index = 0;
        for (int i = 0; i < toSearch.length; i++) {
            if (toSearch[i] < min) {
                min = toSearch[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap (int[] toSwap, int firstPosition, int secondPosition) {
        int temp;
        temp = toSwap[firstPosition];
        toSwap[firstPosition] = toSwap[secondPosition];
        toSwap[secondPosition] = temp;
        return;
    }

    public static void main (String[] args) {
        int[] numbers = {32, 4, 59, 16, 23, 22, 90 ,19, 41};
        selectionSort(numbers);
        System.out.print(Arrays.toString(numbers));

    }
}
