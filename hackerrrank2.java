import java.util.Scanner;

public class hackerrrank2 {
    public static void main(String[] args){
      String name="The name is param ";
      if(name.charAt(name.length()-1)!=' '){
        name=name+" ";
      }
      System.out.println(name);
      String reveString="";
      int s=name.length();
      for(int i=name.length()-1;i>=0;i--){
        if(name.charAt(i)==' '){
          String jetha=name.substring(i+1, s);
          s=i+1;
          reveString=reveString+jetha;
        }
      }
      for(int i=0;i<name.length();i++){
        if(name.charAt(i)==' '){
          reveString=reveString+name.substring(0,i);
          break;
        }
      }
      if(reveString==""){
        reveString=reveString+name;
      }
      System.out.println(reveString);
}
}