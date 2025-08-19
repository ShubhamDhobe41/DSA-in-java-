package Array.LargestElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestElementCollection {
    public static void main(String[] args) {
        int arr[]={23,133,43,122,4,3,11};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            list.add(arr[i]);
        }
        int res = Collections.max(list);
        System.out.println(res);
    }
}
