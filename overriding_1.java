class A{

    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in A config");
    }
}

class B extends A{
    public void show(){ // this show overrides the mothod in A. So this will print in b and then config
        System.out.println("in B show");
    }

}

public class overriding_1 {
    public static void main(String args[]){

        B obj = new B();
        obj.show();
        obj.config();


    }

}
