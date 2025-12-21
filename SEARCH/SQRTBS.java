package SEARCH;
public class SQRTBS {
    static int sqrt(int n){
        int low=0;
        int high=n;
        int ans=0;

        while(low<=high){ 
            int mid=low+(high-low)/2; //0 +(40)=20 // 0+19=9

            if(mid<=n/mid){   
                ans=mid;
                low=low+1;
            }
            else{
                high=mid-1; // 19
            }
        }
        return ans;
}
    public static void main(String[] args) {System.out.println(sqrt(40));}    
}