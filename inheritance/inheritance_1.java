package inheritance;

class Calc{

    public int add(int n1,int n2)
    {
        return n1 + n2;
    }
    public int sub(int n1, int n2)
    {
        return n1 - n2;
    }
    
}

class A {

    
}

class B{


}

class C{

    
}

public class inheritance_1 {
    public static void main(String args[]){
        //Calc obj = new Calc();
        //inheritance_2 obj = new inheritance_2();
        inheritance_3 obj = new inheritance_3(); 
        int r1 = obj.add(4,5);
        int r2 = obj.sub(7,3);
        int r3 = obj.mul(5,3);
        int r4 = obj.div(15,4);
        double r5 = obj.power(4,2);

        System.out.println(r1 + "  " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
