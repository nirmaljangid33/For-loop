public class A14 {
    public static void main(String[] args) {
        System.out.println("Numbers between 1 to 100 that are divisible by both 11 and 5:");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
