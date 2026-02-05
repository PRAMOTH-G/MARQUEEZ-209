package ARRAY;
class chu {
    public static void main(String[] args){
     int a=123456;
     int rev=0;
     while(a>0){
        rev=rev*100+a%100;
        a=a/100;
     }
     System.out.println(rev);
    }
}
