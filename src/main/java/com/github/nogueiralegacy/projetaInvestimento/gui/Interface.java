package com.github.nogueiralegacy.projetaInvestimento.gui;

import javax.swing.JOptionPane;

public class Interface {
    public static String caixaDeDialogo(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    public static void mostrarMensagem(String titulo, String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}
