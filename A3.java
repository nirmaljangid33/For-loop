import java.util.*;
public class A3 {
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        int n = sa.nextInt();
        int mul=1;

        for(int i=1; i<=10;i++){
              mul = n*i;
            System.out.println( +mul);
        }
        
    }
}
