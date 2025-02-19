import java.util.*;
public class A17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int d= n;
        int tem=1, sum =0;

        while(n!=0){
              tem = n%10;
              sum = sum*10+tem;
              n=n/10;
        }

        if(sum == d){
        System.out.println(sum + " is a pallindrome");
    }
    else {
        System.out.println(sum + " not  pallindrome");

    }
    }
}
