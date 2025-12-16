package array_2;
public class BUYSELL {
    static int checkBuy(int []arr){
       int minarray=arr[0];
       int maxprofit=0;

       for(int i=0;i<arr.length;i++){
        if(arr[i]<minarray){
            minarray=arr[i];
        }
        else{
            int profit=arr[i]-minarray;

            maxprofit=Math.max(profit,maxprofit);
        }

       }
       return maxprofit;
    }
    public static void main(String[]args){
        int []arr={7,5,2,3,1,8};
        System.out.println(checkBuy(arr));
    }    
}
