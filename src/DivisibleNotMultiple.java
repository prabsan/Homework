import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleNotMultiple {
    public void DivisibleNotMultiple (int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 2000 && arr[i] < 2500 && arr[i] % 7 == 0 && arr[i] % 5 != 0) {
                    arrList.add(arr[i]);
                }
            }
        System.out.println(Arrays.toString(arr));
        System.out.println("Numbers between 2000-2500 in the array above that are divisible by 7, but not by 5: ");
        for(Integer number : arrList) {
            System.out.println(number);
            }
        }
    }

