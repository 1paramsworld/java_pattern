public class pattern6 {
    public static void main(String[] args){
        int n=5;
        int count=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(j<=i){
                    System.out.print(count+" ");
                    count++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
