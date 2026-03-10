public class arithmetic_operators {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 7;

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num2 / num1;
        int remainder = num2 % num1;

        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + addition);
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + subtraction);
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + multiplication);
        System.out.println("Division of " + num2 + " by " + num1 + " is: " + division);
        System.out.println("Remainder when " + num2 + " is divided by " + num1 + " is: " + remainder);
    }
}