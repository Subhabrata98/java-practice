class A{
    public A()
    {
        System.out.println("Object Created");
    }
    public void show()
    {
        System.out.println("In A show");
    }
}



public class naming {
    public static void main(String args[]){

        //In java we follow Camel Casing
        //class and interface = Calc, Runnable  // first letter capital
        //variable and methods = marks, show() // all in lower case
        //constants = PIE, BRAND //all in capital letters

        //for writing big words and joing them use capital foor the starting of the word
        //showMyMarks() in java avoid using uunderscore, it can be used but not a used method for java
          
        int marks;
        marks = 99;


        // A obj = new A();
        A obj;
        obj = new A();
        obj.show();
        System.out.println(marks);

    }
}
