package cap6;

class FSDemo {
    public static void main(String args[]) {
        FailSoftArray array = new FailSoftArray(5, -1);

        int x;

        // Exibe falhas silenciosas
        System.out.println("Fail quietly.");
        for(int i=0; i < (array.length * 2); i++)
            array.put(i, i*10);

        for(int i=0; i < (array.length * 2); i++) {
            x = array.get(i);
            if(x != -1) System.out.print(x + " ");
        }
        System.out.println("");

        // Trata falhas explicitamente
        System.out.println("\nFail with error reports.");
        for(int i=0; i < (array.length * 2); i++)
            if(!array.put(i, i*10))
                System.out.println("Index " + i + " out-of-bounds");

        for(int i=0; i < (array.length * 2); i++) {
            x = array.get(i);
            if(x != -1) System.out.print(x + " ");
            else System.out.println("Index " + i + " out-of-bounds");
        }
    }
}

