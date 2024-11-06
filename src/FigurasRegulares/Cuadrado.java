package FigurasRegulares;

public class Cuadrado {
    double lado1, lado2;

    // PARA EL OBJETO INICIALIZADO SIN VALORES
    public Cuadrado() {

    }

    public Cuadrado(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }


    public double areaCuadrado() {
        double area = lado1*lado2;
        return area;
    }

    public double perimetroCuadrado() {
        double perimetro = 4 * lado1;
        return perimetro;
    }
}


