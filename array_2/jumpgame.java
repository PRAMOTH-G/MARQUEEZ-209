package array_2;
import java.util.*;
public class jumpgame {
 static boolean checkjump(int[] arr){
    int maxreach=0;

    for(int i=0;i<arr.length;i++){
        if (i>maxreach)return false;
    
    maxreach=Math.max(maxreach,i+arr[i]);
    }
    return true;
 }


    public static void main(String[] args) {
        int[]arr={3,2,1,1,1};
        System.out.println(checkjump(arr));
        
    }

    
}
