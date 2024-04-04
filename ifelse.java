import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter age:");
        // int age=sc.nextInt();

        // if(age>18){
        //     System.out.println("adult");
        // }
        // else{
        //     System.out.println("not an adult");
        // }


        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter number");
        // int number=sc.nextInt();
        // if(number%2==0){
        //     System.out.println("even");
        // }
        // else{
        //     System.out.println("odd");
        // }
    

        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.println("both the numbers are same");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}
