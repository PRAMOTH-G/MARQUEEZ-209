package ARRAY;
import java.util.*;
public class ALTERPOS_NEG {
public static void alpn(int[] arr){
            int n=arr.length;
            int []pos=new int[n];
            int []neg=new int[n];

            int po=0,ne=0;
            for(int num:arr){
                //seperate pos and neg;
                if(num>0) pos[po++]=num;
                else neg[ne++]=num;
            }

            int i=0,j=0,k=0;

            //Merge altenative
            while(i<ne&&j<po){
                arr[k++]=neg[i++];
                arr[k++]=pos[j++];
            }
            //remaing neg
           while(i<ne) arr[k++]=neg[i++];
           while(j<po) arr[k++]=pos[j++];
          

}

    public static void main(String[] args) {
        int[]arr={1,2,3,-1,-2,-3,4};
        alpn(arr);

        for(int x:arr){System.out.print(x+" ");}

    }
}
