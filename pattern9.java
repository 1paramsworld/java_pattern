public class pattern9 {
    public static void main(String args[]){
        int count=4;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>=1+count){
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
