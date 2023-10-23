package Q_50;

public class DemoFiguraGeometrica {
    public static void main(String[] args){
        Circulo circulo = new Circulo();
        System.out.println(circulo.desenho());
        System.out.println();

        Quadrado quadrado = new Quadrado();
        System.out.println(quadrado.desenho());
        System.out.println();

        Triangulo triangulo = new Triangulo();
        System.out.println(triangulo.desenho());
        System.out.println();
    }
}
