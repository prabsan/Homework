import java.util.Arrays;

public class InsertionSort {
    public static void InsertionSort(int[] newArray) {
        while (!arrayInOrder(newArray)) {
            int counter = 1;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (!arrayInOrder(newArray)) {
                    for (int j = 0; j < newArray.length - 1; j++) {
                        if (newArray[j] > newArray[j + 1] && !arrayInOrder(newArray)) {
                            int save = newArray[j];
                            newArray[j] = newArray[j + 1];
                            newArray[j + 1] = save;
                        }
                        if (!arrayInOrder(newArray)) {
                            System.out.println("Pass " + counter + ": " + Arrays.toString(newArray));
                            counter++;
                        }
                        if (arrayInOrder(newArray)) {
                            System.out.println("Final Answer: " + Arrays.toString(newArray));
                            break;
                        }
                    }
                }
            }
        }
    }


    public static boolean arrayInOrder(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                counter++;
            }
        }
        if (counter == arr.length - 1) {
            return true;
        }
        return false;
    }

}