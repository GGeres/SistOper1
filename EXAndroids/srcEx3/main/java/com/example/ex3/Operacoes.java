package com.example.ex3;

public class Operacoes {

    public static int maior(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int somarImpares(int a, int b) {
        int soma = 0;
        int inicio = Math.min(a, b);
        int fim = Math.max(a, b);

        for (int i = inicio + 1; i < fim; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        return soma;
    }
}
