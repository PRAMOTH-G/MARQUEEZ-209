import java.util.*;

public class Painters {
    static boolean canpaint(int []boards,int k,int Maxtime){
        int painters=1;
        int sum=0;
        for(int board:boards){
            sum+=board;//10,30,60,100
    
      if(sum>Maxtime){//10>50
        painters++;//2
        sum=board;//sum=20
      
      if(painters>k){
        return false;
    }
    }
}
return true;
}
    static int minTime(int[]board,int k){
        int low=0,high=0;
        
        for(int b:board){
            high+=b;//100
            low=Math.max(low,b);//40
        }
        int ans=high;//100
        while(low<=high){//40<=100
            int mid=(low+high)/2;  //50

            if(canpaint(board,k,mid)){ //
                ans=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return ans;
 }

    public static void main(String[] args) {
        int [] board={10,20,30,40};
        int k=2;
        System.out.println(minTime(board,k));
    }
}