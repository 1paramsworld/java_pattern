public class pattern12 {
    public static void main(String[] args){
        int count=5;
        int a=0;
        int b=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(j==count-a || j==count+b){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            a++;
            b++;

            System.out.println();
        }

    }
}