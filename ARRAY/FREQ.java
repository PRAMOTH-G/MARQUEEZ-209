package ARRAY;
import java.util.*;
public class FREQ {
     static void checkfreq(int[]arr,int N){
        
        for(int i=0;i<N;i++){
            arr[i]--;
        }

        for(int i=0;i<N;i++){
            int index=arr[i]%N;
            arr[index]+=N;
        }

        for(int i=0;i<N;i++){
            System.out.print((i+1)+"->"+arr[i]/N);

        }

     }
    static void main(String [] args){
        int [] arr={2,3,2,3,5};
        int N=arr.length;
        checkfreq(arr,N);

    }
}
