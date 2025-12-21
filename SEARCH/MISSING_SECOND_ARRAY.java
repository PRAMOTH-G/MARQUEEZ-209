package SEARCH;
import java.util.*;
public class MISSING_SECOND_ARRAY {
    static int findMissing(int []arr1,int []arr2){

        int res=0;
        for(int num:arr1) res^=num;
        for(int num:arr2) res^=num;
        return res;
    }

  public static void main(String[] args) {
    int[] arr1={1, 2, 3, 4, 5};
    int[]arr2={1, 2, 3, 5};
    System.out.println(findMissing(arr1,arr2));
}
    
}