import java.util.Scanner;

public class A18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int tem = 1, sum = 0;

        while (n != 0) {
            tem = n % 10;
            sum = sum * 10 + tem;
            n = n / 10 ;
        }
        System.out.println(" revers number : " + sum);

    }
}
