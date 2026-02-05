// Arrival  = [900, 940, 950, 1100, 1500, 1800]
// Departure= [910, 1200, 1120, 1130, 1900, 2000]
// Output = 3
package SORTED;
import java.util.*;

public class Minimum_Platforms {
    public static void main(String[] args) {
        int []arrv={900, 940, 950, 1100, 1500, 1800};
        int []dept={910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(CheckMP(arrv,dept,arrv.length));
    }
    static int CheckMP(int []arrv,int []dept,int n){
        Arrays.sort(arrv);
        Arrays.sort(dept);

        int platform =1,maxplatform=1;
        int i=1,j=0;

        while(i<n&&j<n){
            if(arrv[i]<=dept[j]){platform ++;i++;}
            else{platform--;j++;}
            maxplatform=Math.max(platform,maxplatform);
        }
        return maxplatform;
    }
    
}
