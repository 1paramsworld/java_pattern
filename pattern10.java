public class pattern10 {
    public static void main(String[] args){
        int n=5;
        int m=5;
        int count=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==j || j==1 || j==5 || j%2==0 && i%2==0 ){
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
