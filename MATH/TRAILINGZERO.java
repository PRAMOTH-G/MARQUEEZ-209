import java.util.*;
public class TRAILINGZERO {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        while(temp>0){
            temp=temp/5;
            count=count+temp;

        }
        System.out.println(3%510);
        System.out.println("count : "+count);

       

    }
}
