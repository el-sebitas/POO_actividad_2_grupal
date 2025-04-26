package figuras_geometricas;

public class Rectangulo {
    int base;
    int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double area() {
        return this.base * this.altura;
    }

    double perimetro() {
        return 2 * (this.base + this.altura);
    }

    double hipotenusa() {
        return Math.hypot(this.base, this.altura);
    }
}
