package figuras_geometricas;

public class Triangulo {
    int base;
    int altura;

    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    double area() {
        return (double) (this.base * this.altura) / 2;
    }

    double perimetro() {
        return this.base + this.altura + Math.hypot(this.base, this.altura);
    }

    void tipo() {
        int hipotenusa = (int) (Math.hypot(this.altura, this.base));
        if (this.base == this.altura && this.base == hipotenusa) {
            System.out.println("Es equilatero");
        } else if (this.base == this.altura || this.altura == hipotenusa || this.base == hipotenusa) {
            System.out.println("Es isosceles");
        } else {
            System.out.println("Es escaleno");
        }
    }

}
