package array_2;
public class MAXDIFFERENCE {
    static int checkMD(int []arr){
        int maxadd=Integer.MIN_VALUE;//0
        int minadd=Integer.MAX_VALUE;//100
        int maxsub=Integer.MIN_VALUE;//0
        int minsub=Integer.MAX_VALUE;//100

        for(int i=0;i<arr.length;i++){ //MAX=arr[0]+0=1,//arr[1]+1=4,//arr[2]+2=-1+2=1
                                      //MIN=arr[0]-0=1, arr[1]-1=2,arr[2]-2=-3
            maxadd=Math.max(maxadd,arr[i]+i);//4
            minadd=Math.min(minadd, arr[i]+i);//1
            maxsub=Math.max(maxsub,arr[i]-i);//2
            minsub=Math.min(minsub, arr[i]-i);//-3


        }              //4-1,2-(-3);
        return Math.max(maxadd-minadd,maxsub-minsub);
    } 
    public static void main(String[] args) {
        int [] arr={1,3,-1};
        System.out.println(checkMD(arr));

        
    }

    
}