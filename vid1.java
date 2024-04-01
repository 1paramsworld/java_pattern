public class vid1 {
    public static void main(String[] args) {
        int target=5;

        for (int i = 1; i <= 5; i++) {
            for(int j=1;j<=target+5;j++){
                if(j<=target){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                    
                }
                
            }
            target--;
            System.out.println();
        }
    }
}
