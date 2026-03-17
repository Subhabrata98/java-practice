class Calculator{

    int num = 5;
    public int add(int n1, int n2)
    {
        System.out.println(num);      
        return n1 + n2;
    }
}

public class stack_heap {
    public static void main(String args[]){

        //int data = 10; 

        Calculator calc = new Calculator();

        int result = calc.add(3,4);

        // int result = num1 + num2;

         System.out.println(result);
    }
}
