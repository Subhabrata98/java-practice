class Mobile{
    
    String brand;
    int price;
    static String name; //static  effects all the objects . in mob1, we change the name but mob2 also gets changed
    //we have a common variable which will be used by all the object

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}


public class static_1 {
    public static void main(String args[]){

    Mobile mob1 = new Mobile();
    mob1.brand = "Apple";
    mob1.price = 1500;
    // mob1.name = "SmartPhone";
    Mobile.name = "SmartPhone";

    Mobile mob2 = new Mobile();
    mob2.brand = "Samsung";
    mob2.price = 1700;
    // mob2.name = "SmartPhone";
    Mobile.name = "SmartPhone";

    // mob1.name="Phone";
    Mobile.name = "Phone";

    mob1.show();
    mob2.show();

    }

    
}
