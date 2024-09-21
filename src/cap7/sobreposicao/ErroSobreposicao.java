package cap7.sobreposicao;

import java.util.logging.Logger;

class ErroSobreposicao {
    final String LOG_TAG = "ErroSobreposicao";
}

class A {
    final void meth() {
        System.out.println("This is a final method.");
    }
}

class B extends A {
    // ERRO! N�o pode sobrepor meth() porque � final
    /*
    void meth() {
        System.out.println("Illegal!");
    }
    */
}

class ErrorMsg {
    final int OUTERR = 0;
    final int DISKERR = 2;

    String msgs[] = {
            "Output Error",
            "Disk Full"
    };

    // Retorna a mensagem de erro correspondente ao c�digo
    String getErrorMsg(int i) {
        if(i >= 0 && i < msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";
    }
}

class FinalD {
    public static void main(String args[]) {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
        Logger log = Logger.getLogger(FinalD.class.getName());
        log.info(new ErroSobreposicao().LOG_TAG);
    }
}
