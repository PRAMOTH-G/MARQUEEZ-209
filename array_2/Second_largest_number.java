package array_2;
import java.util.*;
public class Second_largest_number {
public static void main(String[] args) {
    int []arr={10,20,4,450,99};
    int n=arr.length;
    int max=arr[0];
    int smax=0;
    for(int i=1;i<n;i++){
        if(arr[i]>max){smax=max;max=arr[i];}
        else if(arr[i]>smax&&arr[i]!=max){smax=arr[i];}
    }
    System.out.println(smax);
}
    
}
