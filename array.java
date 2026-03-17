public class array {
    public static void main(String args[]){


        int nums[] = {3,7,2,4};
        nums[1] = 6; // we can also change the values by using the index number
        System.out.println(nums[1]); // we need to use the index values to fetch the number

        int num[] = new int[4];// initially we dont have the values, so we set the no of values we want

        num[0] = 4; // assigning the values using the index values
        num[1] = 8;
        num[2] = 3;
        num[3] = 9;

        for(int i=0; i<4; i++){ // fething all the values at once using the for loop.
            System.out.println(num[i]);
        }
    }
}
