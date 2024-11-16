package cap10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Help {
    String helpfile; // Nome do arquivo de ajuda
    Help(String fname) {
        helpfile = fname;
    }
    // Exibe ajuda sobre um tópico.
    boolean helpOn(String what) {
        int ch;
        String topic, info;
        // Abre o arquivo de ajuda.
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile)))
        {
            do {
                // lê caracteres até um # ser encontrado
                ch = helpRdr.read();
                // agora, vê se os tópicos coincidem
                if (ch == '#') {
                    topic = helpRdr.readLine();
                    {
                        if (what.compareTo(topic) == 0) { // tópico encontrado
                            do {
                                info = helpRdr.readLine();
                                if (info != null)
                                    System.out.println(info);
                            } while ((info != null) &&
                                    (info.compareTo("") != 0));
                            return true;
                        }
                    }
                }
            } while (ch != -1) ;
        } catch(IOException exc) {
            System.out.println("Error accessing help file.");
            return false;
        }
        return false; // tópico não encontrado
    }
    // Acessa um tópico da Ajuda.
    String getSelection() {
        String topic = "";
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("Enter topic: ");
        try {
            topic = br.readLine();
        }
        catch(IOException exc) {
            System.out.println("Error reading console.");
        }
        return topic;
    }
}

// Demonstra o sistema de ajuda baseado em arquivo.
class FileHelp {
    public static void main(String args[]) {
        Help hlpobj = new Help("C:\\arq_estudo_java\\helpfile.txt");
        String topic;
        System.out.println("Try the help system. " +
                "Enter 'stop' to end.");
        do {
            topic = hlpobj.getSelection();
            if(!hlpobj.helpOn(topic))
                System.out.println("Topic not found.\n");
        } while(topic.compareTo("stop") != 0);
    }
}
