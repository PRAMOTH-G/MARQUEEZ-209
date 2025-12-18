package SEARCH;

public class LEFTANDRIGHT_INDEX {
   static int CHECKLEFT(int[]arr,int k){
    int low=0;
    int high=arr.length-1;
    int ans=-1;
    while(low<high){
        int mid=(low+high)/2;

        if(arr[mid]==k) {ans=mid;high=mid-1;}
        else if(arr[mid]<k){low=mid+1;}
        else{high=mid-1;}
        
    }
    return ans;
}
static int CHECKRIGHT(int [] arr,int k){
    int low=0,high=arr.length-1;
    int ans=-1;
    while(low<high){
        int mid=(low+high)/2;

        if(arr[mid]==k) {ans=mid;low=mid+1;}
        else if(arr[mid]<k){low=mid+1;}
        else{high=mid-1;}
        
    }
    return ans;
}



    public static void main(String[] args) {
        int[]arr={5, 7,7,7,7,9, 11};
        int target=7;
        System.out.println("LEFTMOST  "+CHECKLEFT(arr,target));
        System.out.println("RIGHTMOST  "+CHECKRIGHT(arr,target));
        
    }
}
