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


public class inheritance_1 {
    public static void main(String args[]){
        Calc obj = new Calc();
        int r1 = obj.add(4,5);
        int r2 = obj.add(7,3);
        int r3 = obj.add(5,3);
        int r4 = obj.add(15,4);

        System.out.println(r1 + "  " + r2 + " " + r3 + " " + r4 );
    }
}
