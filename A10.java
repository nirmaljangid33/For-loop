public class A10 {
        public static void main(String[] args) {
            int sum =0;
            for(int i=1000; i>=500;i--){
                if(i%2!=0){
                    sum =sum+i;
                }
            }
            System.out.println("odd number = " +sum);
        }

}
