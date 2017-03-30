import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
	if (args.length < 1) {
        System.out.println("No input provided");
    }
    else if (args.length == 1) {
	    // list is already sorted, so print as is
        System.out.println(Arrays.toString(args));
    }
    else {
	    int[] unsortedList = new int[args.length];

	    for (int i=0; i < args.length; i++){
	        unsortedList[i] = Integer.parseInt(args[i]);
        }
        System.out.println(Arrays.toString(insertionSort(unsortedList)));
    }
    }

    private static int[] insertionSort(int [] unsortedList) {
        int j = 1;
        for (int i = 0; i < (unsortedList.length - 1); i++) {
            int key = unsortedList[j];
            int k = j - 1;

            while (k >= 0 && unsortedList[k] > key) {
                unsortedList[k + 1] = unsortedList[k];
                k--;
            }

            unsortedList[k + 1] = key;
            j++;
        }
        return unsortedList;
    }
}
