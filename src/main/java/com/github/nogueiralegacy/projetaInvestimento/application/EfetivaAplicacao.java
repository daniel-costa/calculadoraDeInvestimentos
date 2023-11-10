package com.github.nogueiralegacy.projetainvestimento.application;

import com.github.nogueiralegacy.projetainvestimento.domain.CalculadoraInvestimento;
import com.github.nogueiralegacy.projetainvestimento.domain.Investimento;
import com.github.nogueiralegacy.projetainvestimento.gui.Interface;

public class EfetivaAplicacao {

    private static double validaEntradaDeDouble(String nomeValor) {
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

    private static Investimento coletaDados() {
        double investimentoInicial = validaEntradaDeDouble("Investimento Inicial");
        double investimentoMensal = validaEntradaDeDouble("Investimento Mensal");
        int quantidadeMeses = (int) validaEntradaDeDouble("Quantidade de Meses Investindo");
        double porcentagemRendimentoMensal = validaEntradaDeDouble("Porcentagem de Rendimento Mensal");

        Investimento investimento = new Investimento();
        investimento.setValorInicial(investimentoInicial);
        investimento.setValorMensal(investimentoMensal);
        investimento.setQuantidadeMeses(quantidadeMeses);
        investimento.setPorcetagemRendimentoMensal(porcentagemRendimentoMensal);

        return investimento;
    }

    public static void aplicacao() {
        Investimento investimento = coletaDados();

        double montanteFinal = CalculadoraInvestimento.montanteFinal(investimento);
        double totalInvestido = CalculadoraInvestimento.totalInvestido(investimento);

        String montanteFinalFmt = String.format("R$ %,.2f", montanteFinal);
        String totalInvestidoFmt = String.format("R$ %,.2f", totalInvestido);

        Interface.mostrarMensagem("Projeção", "Montante Final: " + montanteFinalFmt + "\n" + "Total Investido: " + totalInvestidoFmt);
    }
}
