package com.github.nogueiralegacy.projetaInvestimento.gui;

import com.github.nogueiralegacy.projetaInvestimento.domain.CalculadoraInvestimento;
import com.github.nogueiralegacy.projetaInvestimento.utils.Utils;

public class EfetivaAplicacao {

    public static double validaEntradaDeDouble(String nomeValor) {
        while (true) {
            double valor;
            try {
                valor = Utils.parseDouble(Interface.caixaDeDialogo(nomeValor));
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

        double montanteFinal = CalculadoraInvestimento.montanteFinal(investimentoInicial, investimentoMensal, quantidadeMeses, porcentagemRendimentoMensal);
        String resultado = String.format("R$ %.2f", montanteFinal);
        Interface.mostrarMensagem("Montante Final", resultado);

    }
}
