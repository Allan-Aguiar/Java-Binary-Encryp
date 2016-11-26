package encript;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ler {

    private static final File file = new File("C:\\Users\\cem\\Desktop\\BD\\Estudos\\FATEC\\4Semestre\\POO\\Atividade\\2 - Encript\\src\\encript\\dados_nao_encriptados.txt"); // instancia o local do arquivo para poder ser usado
    
    private static final String path = "C:\\Users\\cem\\Desktop\\BD\\Estudos\\FATEC\\4Semestre\\POO\\Atividade\\2 - Encript\\src\\encript\\dados_encriptaods.txt"; // instancia o caminho em que o arquivo será lancado apos ser encriptado

    static void LituraArq() throws IOException {

        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        File dir = new File(path);

        BufferedWriter writer = new BufferedWriter(new FileWriter(dir));

        String data = null;
        
        String reverso = null;
        
        while ((data = reader.readLine()) != null) {
            
            reverso = new StringBuilder(data).reverse().toString(); // inverte a string
            
            writer.write(""+reverso.getBytes()+"   ||  "); // grava apenas os bites da string ao contrário
        }

        writer.flush();//Criando o conteúdo do arquivo
        writer.close();//Fechando conexão e escrita do arquivo.
        
        JOptionPane.showMessageDialog(null, "CAMINHO DO ARQUIVO QUE ENCRIPTADO \n\n" + path);
        fileReader.close();
        reader.close();
    }
}
