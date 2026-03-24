class Human{

private String name;
private int age;

public String getName(){
    return name;
}

public void setName(String name){
    this.name = name;
}

public int getAge(){
    return age;
}

public void setAge(int age){
    this.age = age;
}

public Human(){ // this is a constructor, same class name, no return type, only public class

    age = 18;
    name = "John";
}

}

public class constructor_1 {
    public static void main(String args[]){

    Human obj = new Human();

    System.out.println(obj.getName() + " : " + obj.getAge()); // if we call this we will get null : 0, whhich is tthe default value
    //so we can use constructor to set the default value to another we want
    // it is simar to method, must have same class name, no returntype required as it returns nothing
    // obj.setAge(27);
    // obj.setName("Subhabrata");
        
    }
}
