public class pattern8 {
    public static void main(String[] args){
        int count=0;
        int m=8;
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j<=i || j>=m-count){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                if(i==n && j==m){
                    count=2;
                }
                
            }
            count++;

            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=8;j++){
                if(j<=count+1 || j>=m-count){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            count--;
            System.out.println();
        }
        
    }
}
