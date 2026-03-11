public class if_else {
    public static void main(String args[]){

        int x = 18;
        int a = 5;
        int b = 10;

        if(x>10 && x<=20)   // range 11 - 20
            System.out.println("Hello");
        else
            System.out.println("Bye");


        if(a>b){
            System.out.println(a); //  in if_else whenever we want to print more than 1 line, we need to use curly braces
            System.out.println("Thank You");
        }
        else
            System.out.println(b);
    }
    
}
