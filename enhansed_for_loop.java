public class enhansed_for_loop {
    public static void main(String args[]){

        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;


        // for(int n :nums){
        //     System.out.println(n);
        // }


        Student S1 = new Student(); // manually created these 3 objects , and assign to the array below
        S1.rollno = 1;
        S1.name = "abc";
        S1.marks = 88;

        Student S2 = new Student();
        S2.rollno = 2;
        S2.name = "bcd";
        S2.marks = 80;

        Student S3 = new Student();
        S3.rollno = 3;
        S3.name = "cde";
        S3.marks = 85;

        Student students[] = new Student[3]; 
        students[0] = S1;
        students[1] = S2;
        students[2] = S3;

        for(Student stud : students){ // as this is not a int type, we have to mention the Student type
            System.out.println(stud.name + " : " + stud.marks); //concatinating(joining) using colon
        }
    }
    
}
