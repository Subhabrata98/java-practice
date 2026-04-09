public class pattern_8 {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            // spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}