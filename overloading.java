class Calculator{

   public int add(int n1, int n2, int n3)
   { 
    return n1 + n2 + n3;

   }
   //public int add1(int n1, int n2)
   public int add(int n1, int n2)// we can use same method name but we have to use different parameter or different type of parameter like int , double
   // and this is called method overloading
   {
    return n1 + n2;
   }

   public double add(double n1, double n2){
    return n1 + n2;
   }
}

public class overloading {
    public static void main(String args[]){

    Calculator calc = new Calculator();
    int r1 = calc.add(3,4,5);
    int r2 = calc.add(3,4);   
    double r3 = calc.add(3,2);
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);

       
    }
}
