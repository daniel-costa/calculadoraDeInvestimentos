package com.github.nogueiralegacy.projetainvestimento.domain;

import lombok.Data;

@Data
public class Investimento {
    private double valorInicial;
    private double valorMensal;
    private int quantidadeMeses;
    private double porcetagemRendimentoMensal;
    private double porcentagemCorrecaoAnualInvestimentoMensal;
}
