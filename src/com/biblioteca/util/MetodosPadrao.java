package com.biblioteca.util;

import javax.swing.JOptionPane;

/**
 *
 * @author Instrutores
 */
public class MetodosPadrao {

    public boolean menuPergunta(String pergunta, String tituloJanela) {
        Object[] opcoes = {"Sim", "Não"};
        Object resposta;
        resposta = JOptionPane.showInputDialog(null, pergunta, tituloJanela,
                JOptionPane.OK_CANCEL_OPTION, null, opcoes, "Sim");
        if (resposta.equals("Sim")) {
            return true;
        } else {
            return false;
        }
    }
//    
//    public String cancelamento(){
//        JOptionPane.showMessageDialog(null, this);
//    }
}
