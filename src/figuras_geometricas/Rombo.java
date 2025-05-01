package figuras_geometricas;

public class Rombo {
    int diagonal_mayor;
    int diagonal_menor;

    double area() {
        return (double) (this.diagonal_mayor * this.diagonal_menor) / 2;
    }

    double perimetro() {
        double perimetro = Math.pow((double) (this.diagonal_mayor) /2, 2) + Math.pow((double) (this.diagonal_menor) /2, 2);
        return 4 * Math.sqrt(perimetro);
    }
}
