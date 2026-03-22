class Human{

    private int age = 27; // when private we can only use it in the same calss, noone from other class can accept it
    // everytime we create a instance variable, make it private
    // no one from outside world could use it
    private String name = "Subhabrata";

    // to acccess this private variable we have to use some methods 
    // (you have to ask for it and i will decide if i want to share or not)

    public int getAge(){ //for getting the data
        return age;
    }

    public void setAge(int a){ // whatever value we pass it will be assigned in a, then it will be assigned to age
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){ // using void as we r assigning, not gettting in return
        name = n;
    }

}



public class encapsulation_1 {
    public static void main(String args[]){

        Human obj = new Human();
        obj.setAge(27);  // now we will be using this to set the values 
        obj.setName("Subhabrata Khara"); // assigning the values using method

        System.out.println(obj.getName() + " : " + obj.getAge()); // fetching the values using methods
        
    }
}
