package FigurasRegulares;

public class Rectangulo {

    double baseRec, alturaRec;

    public Rectangulo(double baseRec, double alturaRec) {
        this.baseRec = baseRec;
        this.alturaRec = alturaRec;
    }

    public double getBaseRec() {
        return baseRec;
    }

    public void setBaseRec(double baseRec) {
        this.baseRec = baseRec;
    }

    public double getAlturaRec() {
        return alturaRec;
    }

    public void setAlturaRec(double alturaRec) {
        this.alturaRec = alturaRec;
    }

    public void  areaRectangulo(){
        double areaRec = baseRec * alturaRec;
        System.out.println(" --- RECTANGULO ---");
        System.out.println("Base del Rectangulo: " + baseRec);
        System.out.println("Altura del Rectangulo: " + alturaRec);
        System.out.println("El area del rectangulo es: " + areaRec);
    }

    public void perimetroRectangulo(){
        double perimetroRec = 2 * (baseRec + alturaRec);
        System.out.println("El perimetro del rectangulo es: " + perimetroRec);
    }
}
