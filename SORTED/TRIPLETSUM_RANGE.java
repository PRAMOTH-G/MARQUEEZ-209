package SORTED;
import java.util.*;
public class TRIPLETSUM_RANGE {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
        int low=sc.nextInt();
        System.out.println("MIN " +low);
        
        int high=sc.nextInt();
        System.out.println("MAX "+high);
        System.out.println(CHECKTRIPLE(arr,low,high));//knub k
    }



public static boolean CHECKTRIPLE(int [] arr,int low,int high){
    int n=arr.length;
    Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                double sum=arr[i]+arr[left]+arr[right];

                if(low<sum&&sum<high){return true;}
                else if(sum<=low){left++;}
                else{right--;}
            }
        }
        return false;
}
}