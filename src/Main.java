import FigurasRegulares.Circulo;
import FigurasRegulares.Cuadrado;
import FigurasRegulares.Rectangulo;
import FigurasRegulares.Triangulo;

import java.util.Scanner;

//Richard Padilla
public class Main {
    public static void main(String[] args) {

        Scanner ingresar = new Scanner(System.in);

        // OBJETO INICIALIZADO DE CUADRADO SIN VALORES
        Cuadrado cuadrado1 = new Cuadrado();

        // SETTEAR LOS VALORES CON VALORES INGRESADOS POR EL TECLADO
        System.out.println("Ingrese el lado 1 del Cuadrado: ");
        cuadrado1.setLado1(ingresar.nextDouble());

        System.out.println("Ingrese el lado 2 del Cuadrado: ");
        cuadrado1.setLado2(ingresar.nextDouble());


        // RETORNAR AREA Y PERIMETRO
        System.out.println(" --- CUADRADO --");
        System.out.println("El area del cuadrado es: " + cuadrado1.areaCuadrado());
        System.out.println("El Perimetro del cuadrado es: " + cuadrado1.perimetroCuadrado());

        //IMPRIMIR VALORES, AREAS Y PERIMETROS DE LAS FIGURAS GEOMETRICAS FALTANTES

        //1.- CREAMOS LOS OBJETOS CON VALORES DE LAS FIGURAS
        Rectangulo rectangulo1 = new Rectangulo(8.2,5.0);
        rectangulo1.areaRectangulo();
        rectangulo1.perimetroRectangulo();


        Circulo circulo1 = new Circulo(5.9,3.15149);
        circulo1.areaCirculo();
        circulo1.perimetroCirculo();


        Triangulo triangulo1 = new Triangulo(6.1,5.0,1,2,8);
        triangulo1.areaTriangulo();
        triangulo1.perimetroTriangulo();

        double total = Sumatoria(cuadrado1, rectangulo1,circulo1,triangulo1);

        System.out.println(" --- SUMATORIA --- ");
        System.out.println("La sumatoria de las areas es: " + total);

    }

    // Sumatoria
    public static double Sumatoria(Cuadrado cuadrado1, Rectangulo rectangulo1, Circulo circulo1, Triangulo triangulo1) {
        double totalAreas = cuadrado1.areaCuadrado() +
                (rectangulo1.getBaseRec() * rectangulo1.getAlturaRec()) +
                (circulo1.getPi() * circulo1.getRadio() * circulo1.getRadio()) +
                (triangulo1.getBaseTri() * triangulo1.getAlturaTri() / 2);
        return totalAreas;
    }
}