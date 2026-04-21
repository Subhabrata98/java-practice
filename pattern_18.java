public class pattern_18 {

    public static void main(String[] args) {

        int n = 5;

        for(int i = 0; i < n; i++) {

            char ch = 'A';

            // increasing letters
            for(int j = 0; j <= i; j++) {
                System.out.print((char)(ch + j));
            }

            // decreasing letters
            for(int j = i - 1; j >= 0; j--) {
                System.out.print((char)(ch + j));
            }

            System.out.println();
        }
    }
}