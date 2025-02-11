import java.util.*;
public class A12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting number : ");
        int start = sc.nextInt();
        System.out.println("enter end number : ");
        int end = sc.nextInt();
        for(int i=start;i<=end;i++){
            System.out.println(i*start);
        }
    }
}