package FigurasRegulares;

public class Circulo {

    double radio;
    double pi = 3.14159;

    public Circulo(double radio, double pi) {
        this.radio = radio;
        this.pi = pi;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public void areaCirculo() {
        double areaCir = pi * radio * radio;
        System.out.println(" --- CIRCULO ---");
        System.out.println("Radio del circulo: " + radio);
        System.out.println("El PI: " + pi);
        System.out.println("El area del circulo es: " + areaCir);
    }

    public void perimetroCirculo() {
        double perimetroCir = 2 * pi * radio;
        System.out.println("El parametro del circulo es: " + perimetroCir);

    }
}
