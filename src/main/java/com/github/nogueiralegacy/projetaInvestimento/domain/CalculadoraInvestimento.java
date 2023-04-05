package com.github.nogueiralegacy.projetaInvestimento.domain;

public class CalculadoraInvestimento {

    static public double montanteFinal(double investimentoInicial, double investimentoMensal, int quantidadeMeses,
            double porcentagemRendimentoMensal) {
        double resultado = investimentoInicial * Math.pow((1 + porcentagemRendimentoMensal / 100), quantidadeMeses);

        // projeta cada investimento mensal pelos meses que ele sera aplicado
        for (int indice = quantidadeMeses - 1; indice > 0; indice--) {
            resultado += investimentoMensal * Math.pow((1 + porcentagemRendimentoMensal / 100), indice);
        }

        return resultado;
    }

    static public double totalInvestido(double investimentoInicial, double investimentoMensal, int quantidadeMeses) {
        double resultado = investimentoInicial;
        if (quantidadeMeses == 0) {
            return resultado;
        }

        resultado += investimentoMensal * (quantidadeMeses - 1);
        return resultado;
    }
}
