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

public Human(){ // this is a default constructor, same class name, no return type, only public class

    age = 18;
    name = "John";
}

public Human(int age, String name){ // parameterized constructor

    this.age = age;
    this.name = name;
}

}

public class constructor_1 {
    public static void main(String args[]){

    Human obj = new Human();
    Human obj1 = new Human(27,"Subhabrata");
    Human obj2 = new Human();
    obj2.setName("abc");
    obj2.setAge(15);
    

    System.out.println(obj.getName() + " : " + obj.getAge()); // if we call this we will get null : 0, whhich is the default value
    System.out.println(obj1.getName() + " : " + obj1.getAge());
    System.out.println(obj2.getName() + " : " + obj2.getAge());
    //so we can use constructor to set the default value to another we want
    // it is simar to method, must have same class name, no returntype required as it returns nothing
    // obj.setAge(27);
    // obj.setName("Subhabrata");
        
    }
}
