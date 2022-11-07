public class Runner {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int f = 1; f <= i; f++) {
                System.out.print(f + " ");
            }
            System.out.println();
        }
    }
}