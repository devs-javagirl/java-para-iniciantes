package cap7;

// Retorna um objeto definido pelo programador.
class Err {
    String msg; // mensagem de erro
    int severity; // indicando a gravidade do erro

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}
class ErrorInfo {
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };

    int howbad[] = { 3, 3, 2, 4 };

    //Retorna um objeto de tipo Err.
    Err getErrorInfo(int i) {
        if(i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err("Invalid Error Code", 0);
    }
}

class ErrInfo {
    public static void main(String args[]) {
        ErrorInfo err = new ErrorInfo();

        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);
        e = err.getErrorInfo(1);
        System.out.println(e.msg + " severity: " + e.severity);
    }
}