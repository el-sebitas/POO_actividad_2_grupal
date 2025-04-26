package figuras_geometricas;

public class RunGeometria {
    static void datos (String figura, double a, double p) {
        System.out.println(figura);
        System.out.println("Area: " + a);
        System.out.println("Perimetro: " + p);
    }

    public static void main(String args[]) {
        Circulo c1 = new Circulo(6);
        datos("Circulo", c1.area(), c1.perimetro());
        System.out.println(" ");
        Rectangulo r1 = new Rectangulo(2,5);
        datos("Rectangulo", r1.area(), r1.perimetro());
        System.out.println("Hipotenusa: " + r1.hipotenusa());
        System.out.println(" ");
        Cuadrado b1 = new Cuadrado(20);
        datos("Cuadrado", b1.area(), b1.perimetro());
        System.out.println(" ");
        Triangulo t1 = new Triangulo(6,9);
        datos("Triangulo", t1.area(), t1.perimetro());
        t1.tipo();
    }
}
