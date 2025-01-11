package cap14;
interface MyFunc {
    int func(int n);
}

class VarCapture {
    public static void main(String args[]) {
        // Vari�vel local que pode ser capturada
        int num = 10;

        MyFunc myLambda = (n) -> {
            // Uso correto da vari�vel num
            int v = num + n;

            // A instru��o abaixo � inv�lida porque tenta modificar num
            //num++;

            return v;
        };

        // Usando a express�o lambda
        System.out.println(myLambda.func(8)); // Exibe: 18

        // Modificar num aqui tamb�m causaria erro
        //num = 9;
    }
}
