import java.util.*;
public class TRIPLET_SUM {
   static boolean finalTrip(int[] arr,int L,int R){
    int n=arr.length;
    if(n<3)return false;
    Arrays.sort(arr);

    for(int i=0;i<n-2;i++){
        int left=i+1;
        int right=n-1;

        while(left< right){
            long sum=(long)arr[i]+arr[left]+arr[right];
        if(sum>=L&&sum<=R){return true;}
          else if(sum<L){left++;}
            else{right--;}       
         }

        }
        
        return false;


   }




    public static void main(String[] args) {
        int[]arr={10, 20, 30};
        int L=5;
        int R=25;

        if(finalTrip(arr,L,R))
            System.out.println("Found");
        else
            System.out.println("Not Found");//sumaghjkjhjkjh
        //2sum
    }
}
