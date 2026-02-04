package SORTED;
import java.util.*;
public class pal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System  .in);
        int i=sc.nextInt();
        int copy=0;
        for(int n=i;n>0;n=n/10){copy=copy*10+n%10;}
        String s=(i==copy)?"palindrome":"not palindrome";
        System.out.println(s);
        // String s1=sc.nextLine();
        // int n=s1.length()-1;
        // for(int i=0;i<n/2;i++){
        //     if(s1.charAt(i)!=s1.charAt(n)){System.out.println("not palindrome");return;}
        //     n--;
        // }
        // System.out.println("palindrome");
    }   
}
