package atividade01;

import javax.print.attribute.standard.MediaSize;
import javax.swing.JOptionPane;

public class Atividade01 {
    public static void main(String[] args) {
        
        String mensagem = "";
        double desconto, valor;
        
        JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de venda!");
        
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da venda:"));
        
        if(valor>500){
            desconto = Double.parseDouble(JOptionPane.showInputDialog("Informe seu Desconto:"));
            valor = valor-((valor*desconto)/100);
        } else {
            valor = valor;
        }
        mensagem = "O valor é de: R$"+valor;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
