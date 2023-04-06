package com.github.nogueiralegacy.projetaInvestimento.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculadoraInvestimento {
    @Test
    public void testMontateFinal0Meses() {
        double investimentoInicial = 1000;
        double investimentoMensal = 100;
        int quantidadeMeses = 0;
        double porcentagemRendimentoMensal = 1;
        double correcaoAnualInvestimentoMensal = 1;
        double resultado = CalculadoraInvestimento.montanteFinal(investimentoInicial, investimentoMensal,
                quantidadeMeses, porcentagemRendimentoMensal, correcaoAnualInvestimentoMensal);

        double resultadoEsperado = 1000;

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testMontateFinal1Mes() {
        double investimentoInicial = 1000;
        double investimentoMensal = 100;
        int quantidadeMeses = 1;
        double porcentagemRendimentoMensal = 1;
        double correcaoAnualInvestimentoMensal = 1;
        double resultado = CalculadoraInvestimento.montanteFinal(investimentoInicial, investimentoMensal,
                quantidadeMeses, porcentagemRendimentoMensal, correcaoAnualInvestimentoMensal);

        double resultadoEsperado = 1010;

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testMontateFinal3Meses() {
        double investimentoInicial = 1000;
        double investimentoMensal = 100;
        int quantidadeMeses = 3;
        double porcentagemRendimentoMensal = 1;
        double correcaoAnualInvestimentoMensal = 1;
        double resultado = CalculadoraInvestimento.montanteFinal(investimentoInicial, investimentoMensal,
                quantidadeMeses, porcentagemRendimentoMensal, correcaoAnualInvestimentoMensal);
        double resultadoFormatado = Math.round(resultado * 1000.0) / 1000.0;

        double resultadoEsperado = 1233.311;

        assertEquals(resultadoEsperado, resultadoFormatado);
    }

    @Test
    public void testMontanteFinal14Meses() {
        double investimentoInicial = 100;
        double investimentoMensal = 100;
        int quantidadeMeses = 14;
        double porcentagemRendimentoMensal = 1;
        double correcaoAnualInvestimentoMensal = 4;
        double resultado = CalculadoraInvestimento.montanteFinal(investimentoInicial, investimentoMensal,
                quantidadeMeses, porcentagemRendimentoMensal, correcaoAnualInvestimentoMensal);
        double resultadoFormatado = Math.round(resultado * 100.0) / 100.0;

        double resultadoEsperado = 1513.73;

        assertEquals(resultadoEsperado, resultadoFormatado);
    }


    @Test
    public void testTotalInvestido0Meses() {
        double investimentoInicial = 1000;
        double investimentoMensal = 100;
        int quantidadeMeses = 0;
        double correcaoAnualInvestimentoMensal = 4;
        double resultado = CalculadoraInvestimento.totalInvestido(investimentoInicial, investimentoMensal,
                quantidadeMeses, correcaoAnualInvestimentoMensal);

        double resultadoEsperado = 1000;

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testTotalInvestido1Mes() {
        double investimentoInicial = 1000;
        double investimentoMensal = 100;
        int quantidadeMeses = 1;
        double correcaoAnualInvestimentoMensal = 4;
        double resultado = CalculadoraInvestimento.totalInvestido(investimentoInicial, investimentoMensal,
                quantidadeMeses, correcaoAnualInvestimentoMensal);

        double resultadoEsperado = 1000;

        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void testTotalInvestido3Meses() {
        double investimentoInicial = 1000;
        double investimentoMensal = 100;
        int quantidadeMeses = 3;
        double correcaoAnualInvestimentoMensal = 4;
        double resultado = CalculadoraInvestimento.totalInvestido(investimentoInicial, investimentoMensal,
                quantidadeMeses, correcaoAnualInvestimentoMensal);
        double resultadoFormatado = Math.round(resultado * 1000.0) / 1000.0;

        double resultadoEsperado = 1200;

        assertEquals(resultadoEsperado, resultadoFormatado);
    }

    @Test
    public void testTotalInvestido14Meses() {
        double investimentoInicial = 100;
        double investimentoMensal = 100;
        int quantidadeMeses = 14;
        double correcaoAnualInvestimentoMensal = 4;
        double resultado = CalculadoraInvestimento.totalInvestido(investimentoInicial, investimentoMensal,
                quantidadeMeses, correcaoAnualInvestimentoMensal);
        double resultadoFormatado = Math.round(resultado * 100.0) / 100.0;

        double resultadoEsperado = 1404;

        assertEquals(resultadoEsperado, resultadoFormatado);
    }
}
