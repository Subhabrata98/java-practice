public class odd_even {
    public static void main(String args[]){

        int n = 4;
        int x = 5;
        int result2 = 0;

        String result = n%2==0 ? "Even Number" : "Odd Number";// turnary operator 
        // condition ? value_if_true : value_if_false; n%2==0 ? "even" : "odd"
        // for more than 2 condition
        // condition ? result_1 : conditon_2 ? result_2 : result_3;
        // n>0 ? "Positive" : n<0 ? "Negative" : "Zero";

        int result1 = x%2==0 ? 10 : 20;

        if(n%2==0)
        {
            System.out.println(0);
            result2 = 10;
        }
        else
            {
            System.out.println(1);
            result2 = 20;
            }
        System.out.println(result);  
        System.out.println(result1);
        System.out.println(result2);
    }
}
