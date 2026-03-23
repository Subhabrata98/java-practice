class Human{

    private int age; 
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    
}



public class encapsulation_2 {
    public static void main(String args[]){

        Human obj = new Human();
        obj.setAge(27);  // now we will be using this to set the values 
        obj.setName("Subhabrata Khara"); // assigning the values using method

        System.out.println(obj.getName() + " : " + obj.getAge()); // fetching the values using methods
        
    }
}
