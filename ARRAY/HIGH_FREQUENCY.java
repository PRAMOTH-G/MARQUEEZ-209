package ARRAY;
public class HIGH_FREQUENCY {
public static int check(int []arr){
    int maxfreq=0;
    int result=arr[0];
    for(int i=0;i<arr.length;i++){
        int count=0;

    for(int j=0;j<arr.length;j++){
        if(arr[i]==arr[j]){
            count++;
        }
    }


    if(count>maxfreq){
        maxfreq=count;
        result=arr[i];
    }   
}
return result;
}


    public static void main(String[] args) {
        int[]arr={1,2,3,3,4,4,4,5,6,7};
        System.out.println(check(arr));

    }
    
}