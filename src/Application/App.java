package Application;
import javax.swing.JOptionPane;

import entitites.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
    String nome = JOptionPane.showInputDialog("Digite o Seu nome");
    int idade =  Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade")) ;
    Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura")) ;
    Pessoa pessoa = new Pessoa(nome, idade, altura);
    JOptionPane.showMessageDialog(null, pessoa);

    }
}
