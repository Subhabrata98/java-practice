public class pattern_25 {

    public static void main(String[] args) {

        int n = 5;
        int num = 1;

        for(int i = 1; i <= n; i++) {

            int start = num;

            if(i % 2 == 0) {
                for(int j = n-1; j >= 0; j--) {
                    System.out.print((start + j) + " ");
                }
            } else {
                for(int j = 0; j < n; j++) {
                    System.out.print((start + j) + " ");
                }
            }

            num += n;
            System.out.println();
        }
    }
}