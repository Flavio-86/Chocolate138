package calculosGeometricosGPT;

public class CalculosGeometricosGPT {

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaRetangulo(double comprimento, double largura) {
        return comprimento * largura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }



}


