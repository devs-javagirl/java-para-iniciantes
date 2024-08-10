package cap5;

public class SearchArrayForEach {
        public static void main(String args[]) {
            int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
            int val = 0;
            boolean found = false;

            // Usando o laço for-each para procurar um valor no array
            for(int x : nums) {
                if(x == val) {
                    found = true;
                    break;
                }
            }

            if(found) {
                System.out.println("Value found!");
            } else {
                System.out.println("Value not found!");
            }
        }

}
