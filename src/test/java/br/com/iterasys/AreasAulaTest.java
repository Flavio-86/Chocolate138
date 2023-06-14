package br.com.iterasys;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AreasAulaTest {

    @Test
    public void testarCalcularQuadrado(){
        //Configura
        double lado = 3;
        double resultadoEsperado = 9;

        //Executa
        double resultadoAtual = AreasAula.calcularQuadrado(lado);

        //Valida
        assertEquals (resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testarCalcularRetangulo() {
        // Configura
        double base = 4;
        double altura = 5;
        double resultadoEsperado = 20;

        // Executa
        double resultadoAtual = AreasAula.calcularRetangulo(base, altura);

        // Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }
    @Test
    public void testarCalcularTriangulo() {
        // Configura
        double base = 6;
        double altura = 8;
        double resultadoEsperado = 24;

        // Executa
        double resultadoAtual = AreasAula.calcularTriangulo(base, altura);

        // Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }
    @Test
    public void testarCalcularCirculo() {
        // Configura
        double raio = 2;
        double resultadoEsperado = Math.PI * Math.pow(raio, 2);

        // Executa
        double resultadoAtual = AreasAula.calcularCirculo(raio);

        // Valida
        assertEquals(resultadoEsperado, resultadoAtual, 0.0001);
    }



}
