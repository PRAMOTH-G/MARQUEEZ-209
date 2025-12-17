package array_2;
public class TRAPPING_WATER {
    static int checkTR(int[]arr){
        int left=0;
        int right=arr.length-1;

        int leftmax=0;
        int rightmax=0;

        int water=0;

        while(left<right){//0<6
            if(arr[left]<=arr[right]){  //arr[0]<arr[n-1] and arr[0]>=0>0 -->0+0=0
                                        //arr[1]<arr[n-1]=
                if(arr[left]>=leftmax)leftmax=arr[left];
                else{water+=leftmax-arr[left];}
                left++;
            }
            else{ 
                if(arr[right]>=rightmax)rightmax=arr[right];
                else{water+=rightmax-arr[right];}
                right--;
            }}
            return water;
        }

    public static void main(String[] args) {
        int [] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(checkTR(arr));
        
    }

    
}