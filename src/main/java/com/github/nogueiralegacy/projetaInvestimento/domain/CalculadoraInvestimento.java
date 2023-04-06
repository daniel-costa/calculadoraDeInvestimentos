package com.github.nogueiralegacy.projetaInvestimento.domain;

public class CalculadoraInvestimento {

    static public double montanteFinal(double investimentoInicial, double investimentoMensal, int quantidadeMeses,
            double porcentagemRendimentoMensal, double correcaoAnualInvestimentoMensal) {
        double resultado = investimentoInicial * Math.pow((1 + porcentagemRendimentoMensal / 100), quantidadeMeses);

        // projeta cada investimento mensal pelos meses que ele sera aplicado
        int count = 0;
        for (int indice = quantidadeMeses - 1; indice > 0; indice--) {
            resultado += investimentoMensal * Math.pow((1 + (porcentagemRendimentoMensal / 100)), indice);
            count++;
            if (count % 12 == 0) {
                investimentoMensal *= (1 + (correcaoAnualInvestimentoMensal / 100));
            }
        }

        return resultado;
    }

    static public double totalInvestido(double investimentoInicial, double investimentoMensal,
                                        int quantidadeMeses, double correcaoAnualInvestimentoMensal) {
        double resultado = investimentoInicial;
        if (quantidadeMeses == 0) {
            return resultado;
        }


        int anos = (int) Math.floor(quantidadeMeses / 12);
        int mesesRemanescentes = (quantidadeMeses - 1) % 12;

        for (int i = 0; i < anos; i++) {
            resultado += investimentoMensal  * 12;
            investimentoMensal *= (1 + (correcaoAnualInvestimentoMensal / 100));
        }

        resultado += investimentoMensal * mesesRemanescentes;

        return resultado;
    }
}
