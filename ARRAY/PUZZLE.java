package ARRAY;
import java.util.*;
public class PUZZLE {
    static void checkpuzzle(int[] arr){
       int n=arr.length;
       int[]prod=new int[n];

       int left=1;

       //left side pro
       for(int i=0;i<n;i++){ //i=0;     i=1          
        prod[i]=left;//prod[0]=left=1;   product[1]=1
        left*=arr[i];//left=1*arr[0]=i;  1*=arr[1]=1*2=2;
       }//prod=[1,2,4,6]
       int right=1;
       // right side
       for(int i=n-1;i>=0;i--){
        prod[i]*=right;//prod[3]=4 *1=4 product[2]=4*24=
        right*=arr[i];
       }
       for(int x:prod){
        System.out.print(x+" ");
       }



    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        checkpuzzle(arr);
    }
    
}