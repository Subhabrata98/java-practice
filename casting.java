public class casting {
    public static void main(String[] args) {
        
        // byte b = 125;
        int a = 257; 
        byte k = (byte) a; // max byte can store is 256 i.e -128 to 127 total 256
                           // but when we r trying to forcefully conver int to byte , it uses modulus
                           // i.e % sign, 257%256 and it stores the remainder, which is 1 in this case

        float f = 5.6f;
        int t = (int)f; // when converting float to int, we sacrifise the values after point


        System.out.println(k); // this will print onlt 1 (257/256, remainder 1)
        System.out.println(t); // this will print only the value before decimal
    }
}
