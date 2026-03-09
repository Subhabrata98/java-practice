public class literals {
    public static void main(String[] args) {
        
        //literals

        int num1 = 0b101; //a binary number
        int num2 = 0x7E; //hexadecimal number
        int num3 = 1000000; //its difficult to count the number of zeroes
        int num4 = 10_00_000; //in java we can use space to count the number of zeroes, will return same 
        double num5 = 56; //integer will auto convert to double when we will save it.
        double num6 = 12e10;
        char c = 'a';
        c++;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.err.println(c);


    }
}
