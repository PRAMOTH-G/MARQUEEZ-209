package SORTED;
import java.util.*;

public class RELATIVE_SORTING {
    static void checkRS(Integer[]arr1,Integer[]arr2){
        Map<Integer,Integer> order=new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            order.put(arr2[i],i);
        }
        
        Arrays.sort(arr1,(a,b) ->{
            if(order.containsKey(a)&&order.containsKey(b)){
                return order.get(a)-order.get(b);
            }
            else if(order.containsKey(a)){return -1;}
            else if(order.containsKey(b)){return 1;}
            else{return a-b;}

        });
        System.out.println(Arrays.toString(arr1));

          
    }

    public static void main(String[] args) {
      Integer[] arr1={2,1,2,5,7,1,9,3,6,8,8};
        Integer[] arr2={2,1,8,3};

        checkRS(arr1,arr2);
    }
}
