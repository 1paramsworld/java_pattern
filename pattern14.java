public class pattern14 {
    public static void main(String args[]){
        int count=4;
        int a=0;
        int b=0;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=9;j++){
                if(j>=count-a && j<=count+b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            a++;
            b++;
            System.out.println();
        }

        int count1=4;
        int a1=3;
        int b1=3;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=7;j++){
                if(j>=count1-a1 && j<=count1+b1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            a1--;
            b1--;
            System.out.println();
        }


    }
}
