//final keyword - variables, methods, calss
class Calc{
    // final class Calc{
    public final void show()
    {
        System.out.println("in Calc show");
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

// class AdvCalc extends Calc{
// // we use final in Calc, which means no one can inherit that class now
// public void show()
// {
//     System.out.println(:"by subhabrata");
// }
// }
public class final_1 {
    public static void main(String args[])
    {
        // final int num =8; // final variable -> making constants
        // num = 9; // we masde num = 8, using final which is a constant now. so we can not use num again ti assign it to 9
        // System.out.println(num);
        Calc obj = new Calc();
        obj.show();
        obj.add(4,5);
    }
}
