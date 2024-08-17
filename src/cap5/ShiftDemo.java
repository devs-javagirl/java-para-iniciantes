package cap5;

// Demonstra os operadores de deslocamento << e >>.
class ShiftDemo {
    public static void main(String args[]) {
        //// Demonstra os operadores de deslocamento << e >>.
        int val = 1;
        for(int i = 0; i < 4; i++) {
            for(int t = 8; t > 0; t = t/2) {
                if((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val = val << 1; // deslocamento para a esquerda
        }
        System.out.println();
        val = 8;
        for(int i = 0; i < 4; i++) {
            for(int t = 8; t > 0; t = t/2) {
                if((val & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            val = val >> 1; // deslocamento para a direita
        }
    }
}

