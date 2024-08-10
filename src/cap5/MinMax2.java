package cap5;

public class MinMax2 {
    public static void main(String args[]) {
        //Inicializadores de array
        int nums[] = { 99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49 };
        int min, max;

        min = max = nums[0];

        for(int i=1; i < 10; i++) {
            if(nums[i] < min)
                min = nums[i];
            if(nums[i] > max)
                max = nums[i];
        }

        System.out.println("Min and max: " + min + " " + max);
    }
}
