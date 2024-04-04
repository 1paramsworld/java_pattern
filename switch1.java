import java.util.Scanner;

public class switch1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        String c=sc.nextLine();
        
        switch (c) {
            case "+":
                System.out.println(a+b);
                break;

            case "-":
                System.out.println(a-b);
                break;
        
            default:
                System.out.println("default");
        }
    }
}