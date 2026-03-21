public class string_buffer {
    public static void main(String args[]){ // both string buffr and builder are same
        // one diff is: String buffer is Thread safe but builder is not Thread safe

        StringBuffer sb = new StringBuffer("Subhabrata");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Khara"); // we r appending or adding a string in buffer, in this case we r actually chnaging the value of the string 
        sb.deleteCharAt(2);
        sb.insert(0, "Hello ");
        System.out.println(sb);

    }
}
