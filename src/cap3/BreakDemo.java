package cap3;

// Usando break para sair de um la�o.
class BreakDemo {
    public static void main(String args[]) {
        int num;
        num = 100;
        // executa o la�o enquanto i ao quadrado � menor do que num
        for(int i=0; i < num; i++) {
            if(i*i >= num){
                break; // encerra o la�o se i*i >= 100
            }

            System.out.print(i + " ");
        }
        System.out.println("Loop complete.");
    }
}
