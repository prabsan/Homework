import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort (int[] arr) {
        while(!arrayInOrder(arr)){
            int counter = 1;
            for(int i = 0; i < arr.length-1; i++){
                for(int j = 0; j < arr.length-1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int save = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = save;
                    }
                }
                System.out.println("Pass " + counter + ": " + Arrays.toString(arr));
                counter++;
            }
        }
    }

    public static boolean arrayInOrder (int[] arr) {
        int counter = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]) {
                counter++;
            }
        }
        if(counter == arr.length - 1){
            return true;
        }
        return false;
    }
}