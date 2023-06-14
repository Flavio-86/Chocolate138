package testeCalculosGeometricosGPT;

import calculosGeometricosGPT.CalculosGeometricosGPT;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculosGeometricosTest {

    @Test
    public void testCalcularAreaQuadrado() {
        double lado = 5.0;
        double expected = 25.0;
        double result = CalculosGeometricosGPT.calcularAreaQuadrado(lado);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testCalcularAreaRetangulo() {
        double comprimento = 4.0;
        double largura = 6.0;
        double expected = 24.0;
        double result = CalculosGeometricosGPT.calcularAreaRetangulo(comprimento, largura);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testCalcularAreaTriangulo() {
        double base = 3.0;
        double altura = 8.0;
        double expected = 12.0;
        double result = CalculosGeometricosGPT.calcularAreaTriangulo(base, altura);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void testCalcularAreaCirculo() {
        double raio = 2.5;
        double expected = 19.634954084936208;
        double result = CalculosGeometricosGPT.calcularAreaCirculo(raio);
        Assert.assertEquals(result, expected, 0.00001);
    }
}
