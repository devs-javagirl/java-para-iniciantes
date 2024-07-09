package cap2;

class VarInitDemo {
    public static void main(String args[]) {
        for(int x = 0; x < 3; x++) {
            int y = -1; // y será inicializada a cada vez que o bloco for alcançado
            System.out.println("y is: " + y); // sempre exibe -1
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}

