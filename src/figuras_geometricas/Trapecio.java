package figuras_geometricas;

public class Trapecio {
    int base_mayor;
    int base_menor;
    int altura;

    double area() {
        return (double) ((base_mayor + base_menor) * altura) / 2;
    }

    double perimetro() {
        double lado_o = Math.sqrt(Math.pow((double) (base_mayor - base_menor) /2, 2) + Math.pow(altura, 2));
        return base_mayor + base_menor + 2 * lado_o;
    }
}
