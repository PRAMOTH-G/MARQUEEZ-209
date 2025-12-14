package ARRAY;

public class PLUSONE {
    public static int [] plusone(int [] arr){
         int  n=arr.length;
        for(int i=n-1;i>0;i--){
            
            if(arr[i]<9){
                arr[i]++;
                return arr;
            }
            // arr[i]=9

            arr[i]=0;
        }


        int [] temp=new int[n+1];
        temp[0]=1;
        return temp;
     

    }



    public static void main(String[] args) {
        int [] arr={9,9,9};
        int [] ans=plusone(arr);

        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
