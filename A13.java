import java.util.*;
public class A13 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter frist number : ");
            int frist = sc.nextInt();
            System.out.println("enter scend number : ");
            int scend = sc.nextInt();
            for(int i=1;i<=100;i++){
                if(i%frist==0 && i%scend==0)
                System.out.println(i);
                else{
                    System.out.println("place enter next number : ");
                }
            }
        }
}
