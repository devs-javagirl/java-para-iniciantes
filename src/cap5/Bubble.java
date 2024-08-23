package cap5;

public class Bubble {
    public static void main(String[] args) {
        int t, size = 10;
        int[] nums = { 99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49 };

        for(int a=1; a < size; a++)
            for(int b=size-1; b >= a; b--) {
                if(nums[b-1] > nums[b]) { // se fora de ordem troca elementos
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;

                }
            }

        for (int i = 0; i < size; i++){
            System.out.println(nums[i]);
        }

    }
}
