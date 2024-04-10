public class hackerrank1{
    public static void main(String args[]){
        int[] a={1,1,0,-1,2,-1};
        int positive=0;
        int negative=0;
        int zeros=0;

        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                zeros++;
            }
            if(a[i]>0){
                positive++;
            }
            if(a[i]<0){
                negative++;
            }

        }
        System.out.println((double)positive / a.length);
        System.out.println((double)negative / a.length);
        System.out.println((double)zeros / a.length);
    }
}