package figuras_geometricas;

public class Circulo {
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    double perimetro() {
        return 2 * Math.PI * radio;
    }
}
