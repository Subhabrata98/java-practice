class A extends like_super{ // extends is by default always there but its not visible like super


    public A(){ // A superclass

        //by deafault in every constructor we have super
        super();
        System.out.println( " in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }

}

class B extends A{
    public B(){ //B subcalss
        super();
        System.out.println( " in B");
    }
    public B(int n){//wehen we r calling it its first going to its super class i.e A and returning the default value
        //then it returns parameterized B
        //if we want to print parameterized A first we need to just set the super
        this(); // executes the method of same class
        // super(); //super(n) , noow this will fetch A parameterized first
        System.out.println("in B int");
    }
}


public class like_super {
    public static void main(String args[]){

       // B obj = new B(5); when we specify the value it will choose the parameterized constructor 
       // as we have specified the type there

        B obj = new B(5);
        // System.out.println(obj);
    }
}
