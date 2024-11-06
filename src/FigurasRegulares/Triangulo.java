package FigurasRegulares;

public class Triangulo {
    double baseTri, alturaTri;
    double a, b, c;

    public Triangulo(double baseTri, double alturaTri, double a, double b, double c) {
        this.baseTri = baseTri;
        this.alturaTri = alturaTri;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getBaseTri() {
        return baseTri;
    }

    public void setBaseTri(double baseTri) {
        this.baseTri = baseTri;
    }

    public double getAlturaTri() {
        return alturaTri;
    }

    public void setAlturaTri(double alturaTri) {
        this.alturaTri = alturaTri;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void areaTriangulo(){
        double areaTri = baseTri * alturaTri / 2;
        System.out.println(" --- TRIANGULO ---");
        System.out.println("Base del Triangulo: " + baseTri);
        System.out.println("Altura del Triangulo: " + alturaTri);
        System.out.println("Lado a es: " + a);
        System.out.println("Lado b es: " + b);
        System.out.println("Lado c es: " + c);
        System.out.println("El area del triangulo es: " + areaTri);
    }

    public void perimetroTriangulo(){
        double perimetroTri = a + b + c;
        System.out.println("El perimetro del triangulo es: " + perimetroTri);
    }
}
