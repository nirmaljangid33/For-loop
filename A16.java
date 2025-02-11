import java.util.*;
public class A16 {
        public static void main(String[] args) {
            System.out.print("Enter the number : ");
            Scanner sc  = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=10;i>=1;i--){
              System.out.println(i + " * "+ n +" = "+i*n);
            }
        }
     }
    
