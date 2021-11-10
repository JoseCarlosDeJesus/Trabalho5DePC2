import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ListagemAlunos {
	public static void main(String[]args){
		try {
			Scanner ler=new Scanner(System.in);
			String nomeArqLer=JOptionPane.showInputDialog("Digite o local do arquivo e seu nome: ");
			String nomeArqEscreve =JOptionPane.showInputDialog("Digite o local do arquivo em que será escrito as novas informações e seu nome: ");
			String linha = "";
			String novaLinha = "\n";
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String texto = bf.readLine();
			BufferedReader arquivo = null;
			File escreve=new File(nomeArqEscreve);
			FileOutputStream p= new FileOutputStream(escreve);
			String nota;
			arquivo = new BufferedReader(new FileReader(nomeArqLer));
			while (arquivo.ready()) {
				linha = arquivo.readLine();
				System.out.println(linha);
				System.out.println("Digite a nota do aluno: ");
				nota=ler.next();
				p.write(texto.getBytes());
				p.write(nota.getBytes());
				p.write(novaLinha.getBytes());
			}
			p.close();
			ler.close();
			arquivo.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
