import java.util.*;
public class UNONFORMEDARRAY {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("NUMBER OF ARRAY");
    int n=sc.nextInt();
    System.out.println("NUMBER GIVE THE ARRAY");
    int []arr=new int[n];

    for(int i=0;i<n;i++){arr[i]=sc.nextInt();}

    Arrays.sort(arr);

    int res=1;

    for(int i=0;i<arr.length;i++){
        if(arr[i]<=res){
            res+=arr[i];
        }else{
        break;
        }
    }
    System.out.println(res);





  }  
}
