package br.com.iterasys;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        chamarEncomenda();
        Calculadora.somarInteiros(5,7);
        Calculadora.multiplicarInteiros(5,7);
        Calculadora.DividirInteiros(5,7);
    }
    public static void chamarEncomenda(){
        int barras = 20;{

        Encomenda.calcularBarrasDeChocolatesPorCaixa(barras);
        }
    }
}