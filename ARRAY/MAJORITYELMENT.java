package ARRAY;
import java.util.*;
public class MAJORITYELMENT {
    public static int majoritycheck(int[]arr){
       int  count=0;
       int candidate=0;

        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
                count=1;
            }
            else if(arr[i]==candidate){
                count++;
            }
            else{
                count--;
            }

        }

        int freq=0;
        for(int num:arr){
            if(num==candidate)freq++;
        }

        return (freq>arr.length/2)?candidate:-1;

    }
    public static void main(String[] args){
        int[]arr={2, 2, 1, 2, 3, 2, 2};

        System.out.println(majoritycheck(arr));
    }
    
}
