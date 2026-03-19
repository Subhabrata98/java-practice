class Student {
    int rollno;
    String name;
    int marks;
    
}



public class array_1 {
    public static void main(String args[]){

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

        Student students[] = new Student[3]; // WE R CREATING A ARRAY WHICH CAN HOLD STUDENT REFERENCES
        students[0] = S1;
        students[1] = S2;
        students[2] = S3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);// only students[i] will give address
        }
        // int nums[] = new int[6];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for(int i=0;i<nums.length;i++){ //we can use i<6 but, incase we give more than 6, it gives error, good practice 
        //     //use nums.length property , tells us the actual length of the property so that we dont make any mistake
        //     System.out.println(nums[i]);
        // }
    }
}
