package cap5;

public class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];

        int nums[] = {1, 2, 3};

        int table[][] = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        // Exibindo os tamanhos dos arrays
        System.out.println("length of list is " + list.length);        // Saída: 10
        System.out.println("length of nums is " + nums.length);        // Saída: 3
        System.out.println("length of table is " + table.length);      // Saída: 3

        System.out.println("length of table[0] is " + table[0].length); // Saída: 3
        System.out.println("length of table[1] is " + table[1].length); // Saída: 2
        System.out.println("length of table[2] is " + table[2].length); // Saída: 4

        System.out.println("1 array: " + table[0][0] + ", " + table[0][1] + ", " + table[0][2]);
        System.out.println("2 array: " + table[1][0] + ", " + table[1][1] );
        System.out.println("3 array: " + table[2][0] + ", " + table[2][1] + ", " + table[2][2] + ", " + table[2][3]);

    }
}

