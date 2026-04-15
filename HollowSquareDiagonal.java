
public class HollowSquareDiagonal {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                // Border condition
                if (i == 1 || i == n || j == 1 || j == n
                        // Diagonal conditions
                        || i == j || i + j == n + 1) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
