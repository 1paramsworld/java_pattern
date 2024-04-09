public class pattern15 {
    public static void main(String[] args) {
            int count=5;
            int a=0;
            int b=0;
            for(int i=1;i<=5;i++){
                for(int j=1;j<=9;j++){
                    if(j==count+a || j==count-b){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
                a++;
                b++;
            }
            int c=2;
            int d=8;
            int count1=5;
            for(int i=1;i<=4;i++){
                for(int j=9;j>=1;j--){
                    if(j==c|| j==d){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
                c++;
                d--;
            }

        }
    }

