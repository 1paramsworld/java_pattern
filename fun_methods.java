import java.util.Scanner;

public class fun_methods {
    public static int countSum(int a,int b){
        return a+b;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b1=sc.nextInt();

        int sum=countSum(a, b1);
        System.out.println(sum);
    }
}