package com.github.nogueiralegacy.projetainvestimento.domain;

public class CalculadoraInvestimento {
    static public double montanteFinal(Investimento investimento) {
        double resultado = investimento.getValorInicial();

        if (investimento.getQuantidadeMeses() == 0) {
            return resultado;
        }

        for (int indice = 0; indice < investimento.getQuantidadeMeses(); indice++) {
            resultado = resultado * (1 + investimento.getPorcetagemRendimentoMensal() / 100);
            if (indice != investimento.getQuantidadeMeses() - 1) {
                resultado += investimento.getValorMensal();
            }
        }
        return resultado;
    }

    static public double totalInvestido(Investimento investimento) {
        double resultado = investimento.getValorInicial();
        resultado += investimento.getValorMensal() * (investimento.getQuantidadeMeses() - 1);

        return resultado;
    }

}
