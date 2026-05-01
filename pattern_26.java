public class pattern_26 {

    public static void main(String[] args) {

        int n = 5;
        int num = 1;

        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = i; j < n; j++) {
                System.out.print("  ");
            }

            // numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}