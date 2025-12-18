package SEARCH;

public class COLLECTING_WOOD {
    static boolean correct (int []arr,int h,int m){
                            //array, midvalue,we wane
        int wood=0;
        for(int a:arr){ 
            if(a>h){wood+=(a-h);}
        }
       return wood >=m;
    }
    static int checkWD(int []arr,int m){
        int low=0;//0 10+1=11
        int high=0;// 

        for(int a:arr)
        high=Math.max(high,a);//(0,20)

        int ans=0;

            while(low<=high){//0<=20
                int mid=(low+high)/2;//0+20/10

                if(correct(arr,mid,m)){ //go to function
                    ans=mid;
                    low=mid+1;
                }
                else{high=mid-1;}
            }
            
            
        
        return ans;

    }



    public static void main(String[] args) {
        int[]arr={20, 15, 10, 17};
        int m=7;
        System.out.println(checkWD(arr,m));
    
    }
}
