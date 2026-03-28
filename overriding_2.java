class Calc{

    public int add(int n1, int n2){
        return n1 + n2;
    }
}

class AdvCalc extends Calc{

    public int add(int n1, int n2){ // we r overriding the values in Calc with AdvCalc
        // this can be done, when same method name, same parameter, same returntype,method must be same parent and child class
        //only works with inheritance
        return n1 + n2 + 1;
    }
}



public class overriding_2 {
    public static void main(String args[]){

        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3,5);
        System.out.println(r1);


    }
}
