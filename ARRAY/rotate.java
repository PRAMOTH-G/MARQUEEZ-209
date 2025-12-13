package ARRAY;
import java.util.*;
public class rotate{
    static void reverse(int [] arr,int st,int en){
        while(st<en){
            int temp=arr[st];
            arr[st]=arr[en];
            arr[en]=temp;
            st++;
            en--;

        }
    }

   static void arotate(int []arr,int k){
       int n=arr.length;
        k=k%n; //normalize

        //reverse entire array like {5,4,3,2,1}
        reverse(arr,0,n-1);
        //reverse k times 
        reverse(arr,0,k-1);//{4,5,3,2,1,}
        //reverse remainig 
        reverse(arr,k,n-1);//{4,5,1,2,3}
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int k=3;
        arotate(arr,k);
        System.out.println(Arrays.toString(arr));

    }
}