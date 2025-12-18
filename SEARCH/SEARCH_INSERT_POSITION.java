package SEARCH;
public class SEARCH_INSERT_POSITION {
    static int SRI(int [] arr,int target){
        int low=0;//0
        int high=arr.length-1;//4-1=3

        while(low<=high){
            int mid=low+(high-low)/2; //0(4)/2=2

            if(arr[mid]==target) return mid;

            else if(arr[mid]<target)low=mid+1;

            else high=mid-1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[]arr={1, 3, 5, 6};
        int target=7;
        System.out.print(SRI(arr,target));
    }

    
}