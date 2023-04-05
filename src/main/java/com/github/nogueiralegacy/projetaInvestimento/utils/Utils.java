package com.github.nogueiralegacy.projetaInvestimento.utils;

public class Utils {
    public static double parseDouble(String valor) {
        valor.replace(",", ".");
        return Double.parseDouble(valor);
    }
}
