import java.lang.reflect.Array;
import java.util.Arrays;

public class interview_1{
    public static void main(String[] args){
        int[] a={1,2,4,5,6,7,1,4,3,2,8,8,9,9};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println();
        int i = 0;
        while(i<=a.length) {
            if (i+1 >= a.length){
                System.out.println(a[i]);
                break;
            }
            if(a[i]==a[i+1]){
                i=i+2;
            }
            else{
                System.out.println(a[i]);
                i=i+1;
            }
        }      
    }
}

