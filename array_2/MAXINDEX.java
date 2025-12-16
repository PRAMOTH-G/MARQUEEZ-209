package array_2;
import java.util.*;
public class MAXINDEX {
    static int CHECKMI(int [] arr){
        int n=arr.length;
        int maxDiff=0;

        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                if(arr[i]<=arr[j]) maxDiff=Math.max(maxDiff,j-i);

            }
        }
        return maxDiff;

    }
    public static void main(String[] args) {
        int[]arr={34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(CHECKMI(arr));
    }
    
}
