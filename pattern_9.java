public class pattern_9 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // increasing alphabets
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            // decreasing alphabets
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}