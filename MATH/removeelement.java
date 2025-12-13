package 
import java.util.*;
public class removeelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("ELEMENT ARRAY ARE");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("remove element");
        int remove=sc.nextInt();


        int index=-1;
        for(int i=0;i<n;i++){
          if(arr[i]==remove){
            index=i;
            break;
          }
        }

        if(index==-1){System.out.println("NO ELEMENT");return;}

        for(int i=index;i<n-1;i++){
            arr[i]=arr[i+1];
        }

        System.out.println("after remove an element in array:");
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }






    }
    
}
