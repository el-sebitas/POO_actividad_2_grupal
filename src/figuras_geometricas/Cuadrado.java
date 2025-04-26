package figuras_geometricas;

public class Cuadrado {
    int longitud;

    public Cuadrado(int longitud) {
        this.longitud = longitud;
    }

    double area() {
        return Math.pow(this.longitud, 2);
    }

    double perimetro() {
        return 4 * this.longitud;
    }
}
