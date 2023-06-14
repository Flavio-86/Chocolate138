package calculosGeometricosGPT;

import static calculosGeometricosGPT.CalculosGeometricosGPT.*;

public class testeCalulos {

    public static void main(String[] args) {
        double areaQuadrado = calcularAreaQuadrado(5.0);
        double areaRetangulo = calcularAreaRetangulo(4.0, 6.0);
        double areaTriangulo = calcularAreaTriangulo(3.0, 8.0);
        double areaCirculo = calcularAreaCirculo(2.5);

        System.out.println("area do Quadrado: " + areaQuadrado);
        System.out.println("area do Retangulo: " + areaRetangulo);
        System.out.println("area do Triangulo: " + areaTriangulo);
        System.out.println("area do Circulo: " + areaCirculo);
    }

}