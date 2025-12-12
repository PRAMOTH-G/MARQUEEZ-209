import java.util.*;
public class MISSINGNUMBER_ARR{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of array: ");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("enter array numbers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int len=arr.length+1;
        int calculate = len *(len+1)/2;

        int actualsum=0;
        for(int x:arr){
            actualsum = actualsum + x;
        }
        int ans=calculate-actualsum;
        System.out.println("missing number:"+ans);

    }

}