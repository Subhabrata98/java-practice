class Coumputer
{
    public void playMusic() // we will be definig a method by using round bracket. we also have to give the access
    {                  // here we define what is the behaviour of this particular method. void when we dont want anything in return
        System.out.println("Music Playing");
    }

    public String getMeAPen(int cost) //we r returning a pen, which is a string so we cant use void here
    {
        if(cost>=10)
            return "Pen";
        //else       //we can also not use else here, as if 1st statement is false it will auto get out of loop
            return "Nothing";
    }
}


public class class_2 {
    public static void main(String args[]){
        // this is a different class, and if we want to accest the above class we need to create an object
        Coumputer obj = new Coumputer();
        obj.playMusic();
        String str = obj.getMeAPen(2); // we r using string here as out pen is a string
        System.out.println(str);
    }
    
}
