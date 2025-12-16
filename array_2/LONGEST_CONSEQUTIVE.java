package array_2;
import java.util.*;
public class LONGEST_CONSEQUTIVE {

  static int checkLC(int[]arr){
    Arrays.sort(arr);
    int longest=1;
    int count=1;
    
    for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]) continue;
        if(arr[i]==arr[i-1]+1)count++;
        else{
            count=1;
        }
        longest=Math.max(longest,count);
    }

return longest;

}

    public static void main(String[] args) {
        int[]arr={100,4,200,1,3,2};
        System.out.println(checkLC(arr));
        
    }
    
}
