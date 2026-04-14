public class pattern_13 {
    public static void main(String[] args) {
        int n = 5;

        // upper part
        for(int i = 0; i < n; i++) {

            // spaces
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = i; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower part
        for(int i = n-2; i >= 0; i--) {

            // spaces
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = i; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
} 
