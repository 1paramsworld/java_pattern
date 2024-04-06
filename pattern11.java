public class pattern11 {
    public static void main(String[] args){
        int n=5;
        int m=5;
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5;j++){
                if(j==1 || j==m || i==j && i!=2 || i==j*2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
