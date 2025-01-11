package cap14;
interface MyFunc {
    int func(int n);
}

class VarCapture {
    public static void main(String args[]) {
        // Variável local que pode ser capturada
        int num = 10;

        MyFunc myLambda = (n) -> {
            // Uso correto da variável num
            int v = num + n;

            // A instrução abaixo é inválida porque tenta modificar num
            //num++;

            return v;
        };

        // Usando a expressão lambda
        System.out.println(myLambda.func(8)); // Exibe: 18

        // Modificar num aqui também causaria erro
        //num = 9;
    }
}
