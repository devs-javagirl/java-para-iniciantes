package cap12;

// Vers�o melhorada da simula��o de sem�foro
// que armazena o retardo do sinal em TrafficLightColor1.
// Enumera��o com as cores de um sem�foro.
enum TrafficLightColor1 {
    RED(12000), GREEN(10000), YELLOW(2000);

    private int delay;

    TrafficLightColor1(int d) {
        delay = d;
    }

    int getDelay() {
        return delay;
    }
}


// Sem�foro computadorizado.
class TrafficLightSimulator1 implements Runnable {
    private Thread thrd; // cont�m a thread que executa a simula��o
    private TrafficLightColor1 tlc; // cont�m a cor do sinal atual
    boolean stop = false; // configura com true para interromper a simula��o
    boolean changed = false; // true quando o sinal mudou
    TrafficLightSimulator1(TrafficLightColor1 init) {
        tlc = init;
        thrd = new Thread(this);
        thrd.start();
    }
    TrafficLightSimulator1() {
        tlc = TrafficLightColor1.RED;
        thrd = new Thread(this);
        thrd.start();
    }
    // Inicia o sem�foro.
    public void run() {
        while(!stop) {
            // Observe como esse c�digo foi simplificado!
            try {
                Thread.sleep(tlc.getDelay());
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
                tlc = TrafficLightColor1.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor1.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor1.YELLOW;
        }
        changed = true;
        notify(); // signal that the light has changed
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
    synchronized TrafficLightColor1 getColor() {
        return tlc;
    }
    // Interrompe o sem�foro.
    synchronized void cancel() {
        stop = true;
    }
}

public class TrafficLightDemo2 {
    public static void main(String args[]) {
        TrafficLightSimulator1 tl =
                new TrafficLightSimulator1(TrafficLightColor1.GREEN);
        for(int i=0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();
    }
}
