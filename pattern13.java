public class pattern13 {
    public static void main(String args[]){
        int a=0;
        int b=0;
        for(int i=1;i<=5;i++){
            int count=0;
            for(int j=1;j<=9;j++){
                if((i+j)%2==0 && ((i+j)>=6 && (i+j)<=14)){
                    count++;
                    System.out.print(i);
                    if(i==count){
                        break;
                    }
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
