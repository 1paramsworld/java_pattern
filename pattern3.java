public class pattern3 {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            if(i==4){
                for(int k=0;k<=4;k++){
                    for(int p=4;p>=k;p--){

                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else{
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
    
            }
            
            System.out.println();
        }
    }
}
