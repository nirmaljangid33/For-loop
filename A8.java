public class A8 {
   
        public static void main(String[] args) {
            int sum =0;
            for(int i=100; i>=1;i--){
                if(i%2!=0){
                    sum +=i;
                }
            }
            System.out.println("odd number = " +sum);
        }

}


