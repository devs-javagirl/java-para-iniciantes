package cap5;

public class Exercicio13 {
    //3. Reescreva a classe MinMax mostrada anteriormente neste capítulo para que
    //use um laço for de estilo for-each.

    public static void main(String args[]) {
        int nums[] = new int[10];

        int min, max;
        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0];
        //for(int i=1; i < 10; i++)
        for(int v : nums) {
            if(v < min)
                min = v;
            if(v > max)
                max = v;
        }
        System.out.println("min and max: " + min + " " + max);
    }
}
