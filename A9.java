public class A9 {
    public static void main(String[] args) {
        int sum =0;
        for(int i=50; i<=1000;i++){
            if(i%2==0){
                sum =sum+i;
            }
        }
        System.out.println("even number = " +sum);
    }

}
