package SEARCH;
import java.util.*;
public class BITONIC {
    // static int BITONICCHECK(int [] arr){
    //     int low=0
    //     int high=arr.length;
    // }
    public static void main(String[] args) {
        int [] arr={1, 3, 8, 12, 4, 2};
        int left=0;
        int right=arr.length-1;
       

        int max=arr[0];
        while(left<=right){
            max=Math.max(max,arr[left]);
            max=Math.max(max,arr[right]);
            left++;
            right--;
        }
        System.out.println(max);
        System.out.println(left);
        
    }
    
}