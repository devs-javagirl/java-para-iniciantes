package cap1;


import java.util.logging.Logger;

public class Exemplo1 {

    public static void main(String[] args) {
        System.out.println("Java drives the Web");
        Logger logger = Logger.getLogger(Exemplo1.class.getName());
        logger.info("Deu sucesso");
    }
}
