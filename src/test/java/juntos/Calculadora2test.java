//Pacote
package juntos;
//Bibliotecas
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

//Classe
public class Calculadora2test {
    // Atributos
    //Por enquanto sem atributos

    // métodos e funções
    // Uso compartilhado

    @DataProvider(name = "MassaMultiplicar")
    public Object[][] massaMultiplicar(){
        return new Object[][]{
                {  5,  7, 35 },
                {  2, 10, 20 },
                { 20,  0,  0,}

        };//fecha o return

    }


    // Teste em si




    @Test
    public void testeSomar() {
        // Configure - Arrange
        double num1 = 5;
        double num2 = 7;
        double resultadoEsperado = 12;

        // Executa - Act
        double resultadoAtual = Calculadora2.somar(num1, num2);

        // Valida - Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testeSubtrair() {
        // Configure - Arrange
        double num1 = 7;
        double num2 = 5;
        double resultadoEsperado = 2;

        // Executa - Act
        double resultadoAtual = Calculadora2.subtrair(num1, num2);

        // Valida - Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testeMultiplicar() {
        // Configure - Arrange
        double num1 = 7;
        double num2 = 5;
        double resultadoEsperado = 35;

        // Executa - Act
        double resultadoAtual = Calculadora2.multiplicar(num1, num2);

        // Valida - Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test (dataProvider = "MassaMultiplicar")
    public void testeMultiplicarDD(double num1, double num2, double resultadoEsperado ) {
        // Configure - Arrange


        // Executa - Act
        double resultadoAtual = Calculadora2.multiplicar(num1, num2);

        // Valida - Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testeMultiplicar20por0() {
        // Configure - Arrange
        double num1 = 20;
        double num2 = 0;
        double resultadoEsperado = 0;

        // Executa - Act
        double resultadoAtual = Calculadora2.multiplicar(num1, num2);

        // Valida - Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testeDividir() {
        // Configure - Arrange
        double num1 = 8;
        double num2 = 2;
        double resultadoEsperado = 4;

        // Executa - Act
        double resultadoAtual = Calculadora2.dividir(num1, num2);

        // Valida - Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }

    @Test
    public void testeDividirPorZero() {
        // Configure - Arrange
        double num1 = 8;
        double num2 = 0;
        double resultadoEsperado = Double.NaN;

        // Executa - Act
        double resultadoAtual = Calculadora2.dividir(num1, num2);

        // Valida - Assert
        Assert.assertEquals(resultadoAtual, resultadoEsperado);
    }
}
