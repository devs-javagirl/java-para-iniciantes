package cap12;

// Tente Isto 12-1
// Uma simulação de um semáforo que usa uma enumeração
// para descrever as cores das luzes.

// Enumeração com as cores de um semáforo.
enum TrafficLightColor {
    RED, GREEN, YELLOW
}
// Semáforo computadorizado.
class TrafficLightSimulator implements Runnable {
    private Thread thrd; // contém a thread que executa a simulação
    private TrafficLightColor tlc; // contém a cor do sinal
    boolean stop = false; // configura com true para interromper a simulação
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

    // Inicia o semáforo.
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
    // Espera até uma mudança de sinal ocorrer.
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
    // Interrompe a semáforo.
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
