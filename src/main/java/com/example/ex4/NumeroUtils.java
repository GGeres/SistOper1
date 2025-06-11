package com.example.ex4;

public class NumeroUtils {

    public static String encontrarPrimosNoIntervalo(int inicio, int fim) {
        StringBuilder sb = new StringBuilder();

        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                sb.append(i).append(" ");
            }
        }

        return sb.length() > 0 ? sb.toString().trim() : "Nenhum número primo encontrado";
    }

    private static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}