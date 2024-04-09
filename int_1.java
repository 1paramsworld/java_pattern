public class int_1 {
    public static void main(String[] args){
        int[] a={1,1,3,4,2,2,3,3,4,5,5,6,6,7,7,8,8,9,9};
        for(int i=0;i<a.length;i++){
            if ( i==a.length-1 && a[a.length-1]!=a[a.length-2]){
                System.out.println(a[a.length-1]);
                break;
            }
            if(a[i]==a[i+1]){
                i=i+1;
            }
            else{
                System.out.println(a[i]);
            }
        }
    }
}
