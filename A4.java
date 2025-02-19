import java.util.Scanner;

public class A4 {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int fact=1;
      System.out.print("Enter the number :");
      int n = sc.nextInt();

         for(int i=1;i<=n;i++){
              fact = i*i;
         }
         System.out.println("Enter the number :"+fact);
    }
}
