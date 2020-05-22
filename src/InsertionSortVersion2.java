import java.util.Arrays;

public class InsertionSortVersion2 { //25361

    public void insertionSort (int [] arr) {
        for(int i = 0; i < arr.length-1; i++){
           int j = i + 1;
           while(j > 0) {
               if(arr[j-1] > arr[j]) {
                   int temp = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j] = temp;
               }
               j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
