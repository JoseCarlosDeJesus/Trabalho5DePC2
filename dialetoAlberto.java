
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class dialetoAlberto {

	public static void main(String[] args) {
		String nomeArq = JOptionPane.showInputDialog("Digite o nome do arquivo e o seu diretório: ");
		String linha = "";
		BufferedReader arquivo = null;
		try {
			arquivo = new BufferedReader(new FileReader(nomeArq));
			while (arquivo.ready()) {
				linha = arquivo.readLine();
				for (int i=0; i<linha.length(); i++) {
					   char c=linha.charAt(i);
					   System.out.println(c);
					   if(c=='r' || c=='R') {
						  System.out.println("");
					   }
					   else if(c=='l') {
						  System.out.println("u"); 
					   }
					   else if(c=='L') {
						  System.out.println("U");
					   }
					}
				System.out.println(linha);
			}			
        }catch (NullPointerException e) {
   			   System.out.println(e.getMessage());
   		}catch (FileNotFoundException e) {
   			   System.out.println(e.getMessage());
   		}catch (IOException e) {
   			   System.out.println(e.getMessage());
   		}finally {
   			try {
   				arquivo.close();
   			} catch (NullPointerException e) {
   				System.out.println(e.getMessage());
   			} catch (IOException e) {
   				System.out.println(e.getMessage());
   			}
   		}			
    }
}	
