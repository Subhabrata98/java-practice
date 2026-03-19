public class jagged_array {
    public static void main(String args[]){

        int nums[][] = new int[3][]; //jagged array, we specified the no of rows only

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j] = (int)(Math.random() * 10); // taking random values using math library , multiplying it by 10 to get single digits
                // its double then we r type casting it to int
            }
            
        }



        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)
        //     {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        for(int n[] : nums) // advanced loop
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        
    }
}
