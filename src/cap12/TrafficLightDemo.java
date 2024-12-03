package cap12;

// Tente Isto 12-1
// Uma simula��o de um sem�foro que usa uma enumera��o
// para descrever as cores das luzes.

// Enumera��o com as cores de um sem�foro.
enum TrafficLightColor {
    RED, GREEN, YELLOW
}
// Sem�foro computadorizado.
class TrafficLightSimulator implements Runnable {
    private Thread thrd; // cont�m a thread que executa a simula��o
    private TrafficLightColor tlc; // cont�m a cor do sinal
    boolean stop = false; // configura com true para interromper a simula��o
    boolean changed = false; // true quando o sinal mudou

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
        thrd = new Thread(this);
        thrd.start();
    }

    // Inicia o sem�foro.
    public void run() {
        while(!stop) {
            try {
                switch(tlc) {
                    case GREEN:
                        Thread.sleep(10000); // verde por 10 segundos
                        break;
                    case YELLOW:
                        Thread.sleep(2000); // amarelo por 2 segundos
                        break;
                    case RED:
                        Thread.sleep(12000); // vermelho por 12 segundos
                        break;
                }
            } catch(InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }
    // Muda a cor.
    synchronized void changeColor() {
        switch(tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify(); // sinaliza que a cor mudou
    }
    // Espera at� uma mudan�a de sinal ocorrer.
    synchronized void waitForChange() {
        try {
            while(!changed)
                wait(); // espera o sinal mudar
            changed = false;
        } catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }

    // Retorna a cor atual.
    synchronized TrafficLightColor getColor() {
        return tlc;
    }
    // Interrompe a sem�foro.
    synchronized void cancel() {
        stop = true;
    }
}
class TrafficLightDemo {
    public static void main(String args[]) {
        TrafficLightSimulator tl =
                new TrafficLightSimulator(TrafficLightColor.GREEN);

        for(int i=0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();
    }
}
