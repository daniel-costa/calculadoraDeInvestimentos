package com.github.nogueiralegacy.projetaInvestimento.application;

import com.github.nogueiralegacy.projetaInvestimento.domain.CalculadoraInvestimento;
import com.github.nogueiralegacy.projetaInvestimento.gui.Interface;

public class EfetivaAplicacao {

    public static double validaEntradaDeDouble(String nomeValor) {
        while (true) {
            double valor;
            String entrada = Interface.caixaDeDialogo(nomeValor);
            entrada = entrada.replaceAll(",", ".");
            try {
                valor = Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                Interface.mostrarMensagem("Erro",  nomeValor + " deve ser um número");
                continue;
            }
            if (valor < 0) {
                Interface.mostrarMensagem("Erro", nomeValor + " deve ser um número positivo");
                continue;
            }
            return valor;
        }
    }

    public static void aplicacao() {
        double investimentoInicial = validaEntradaDeDouble("Investimento Inicial");
        double investimentoMensal = validaEntradaDeDouble("Investimento Mensal");
        int quantidadeMeses = (int) validaEntradaDeDouble("Quantidade de Meses Investindo");
        double porcentagemRendimentoMensal = validaEntradaDeDouble("Porcentagem de Rendimento Mensal");
        double correcaoAnualInvestimentoMensal = validaEntradaDeDouble("Correção Anual do Investimento Mensal");

        double montanteFinal = CalculadoraInvestimento.montanteFinal(investimentoInicial, investimentoMensal,
                quantidadeMeses, porcentagemRendimentoMensal, correcaoAnualInvestimentoMensal);
        double totalInvestido = CalculadoraInvestimento.totalInvestido(investimentoInicial, investimentoMensal,
                quantidadeMeses, correcaoAnualInvestimentoMensal);

        String montanteFinalFmt = String.format("R$ %,.2f", montanteFinal);
        String totalInvestidoFmt = String.format("R$ %,.2f", totalInvestido);

        Interface.mostrarMensagem("Projeção", "Montante Final: " + montanteFinalFmt + "\n" + "Total Investido: " + totalInvestidoFmt);

    }
}
