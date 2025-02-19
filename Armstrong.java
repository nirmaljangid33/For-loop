import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int deta =n;
         int tem =0;
         int d=1;
         while(n!=0){
           d= n%10;
           tem += (d*d*d);
              n = n/10;
            
         }
         if(deta == tem){
            System.out.println(tem + " is a armstrong number ");
        }
        else {
             System.out.println(tem + "is a not armstrong number ");

         }
    }
}
