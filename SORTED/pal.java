package SORTED;
import java.util.*;
public class pal {
    public static void main(String[] args) {
       String a = "ABABAB";
       String b = "ABAB";
       if ((a + b).equals(b + a)) {
              int gcdLength = gcd(a.length(), b.length());
              String gcdString = a.substring(0, gcdLength);
              System.out.println("GCD String: " + gcdString);
         } else {
              System.out.println("No GCD String exists.");
         }


    } 
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
      
}


// Check if str1 + str2 == str2 + str1. If not,
//  no GCD exists. If they are equal,
//   the GCD string is the prefix of str1 with length 
//   equal to gcd(len(str1), len(str2)).




//  Scanner sc=new Scanner(System  .in);
//         int i=sc.nextInt();


//         int copy=0;
//         for(int n=i;n>0;n=n/10){copy=copy*10+n%10;}
//         String s=(i==copy)?"palindrome":"not palindrome";
//         System.out.println(s);
//         // String s1=sc.nextLine();
//         // int n=s1.length()-1;
//         // for(int i=0;i<n/2;i++){
//         //     if(s1.charAt(i)!=s1.charAt(n)){System.out.println("not palindrome");return;}
//         //     n--;
//         // }
//         // System.out.println("palindrome");