package cap5;

class ForEach2 {
    public static void main(String args[]) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // Preenchendo o array nums com valores
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);

        // Usando o laço for-each para iterar e somar valores
        for(int x[] : nums) { //pega o primeiro array
            for(int y : x) { //pega o valor do array
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation: " + sum);
    }
}
