package ARRAY;

public class p {
    public static void cp(int [] arr){
        int n=arr.length;
        int [] pro=new int[n];
        int left=1;

        for(int i=0;i<n;i++){
            pro[i]=left;
            left*=arr[i];
        }
        int rigth=1;
        for(int i=n-1;i>=0;i--){
            pro[i]*=rigth;
            rigth*=arr[i];
        }

        for(int x:pro){
            System.err.println(x+" ");
        }
    }


    
        public static void main(String[] args) {
        int[] arr={1,2,3,4};
        cp(arr);
    }
    
    
    
    
}
