public class Planeta {
    String nombre = null;
    int c_satelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distancia_sol = 0;
    enum tipo_planeta {GASEOSO, TERRESTRE, ENANO}
    tipo_planeta tipo;
    boolean observable = false;
    double periodo_orbital;
    int periodo_rotacion;

    Planeta(String nombre, int c_satelites, double masa, double volumen, int diametro, int distancia_sol, tipo_planeta tipo, boolean observable) {
        this.nombre = nombre;
        this.c_satelites = c_satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia_sol = distancia_sol;
        this.tipo = tipo;
        this.observable = observable;
        this.periodo_orbital = 0;
        this.periodo_rotacion = 0;
    }


    Planeta(String nombre, int c_satelites, double masa, double volumen, int diametro, int distancia_sol, tipo_planeta tipo, boolean observable, double periodo, int periodo_rotacion) {
        this.nombre = nombre;
        this.c_satelites = c_satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia_sol = distancia_sol;
        this.tipo = tipo;
        this.observable = observable;
        this.periodo_orbital = periodo;
        this.periodo_rotacion = periodo_rotacion;
    }

    void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + c_satelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diametro);
        System.out.println("Distancia al sol = " + distancia_sol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + observable);
        System.out.println("Periodo orbital = " + periodo_orbital);
        System.out.println("Periodo de rotacion = " + periodo_rotacion);
    }

    double densidad() {
        return this.masa/this.volumen;
    }

    boolean distancias() {
        int ua = 149597870;
        if (this.distancia_sol > ua * 3.4) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Planeta p1 = new Planeta("Tierra",1,5.9736E24,1.08321E12,12742,150000000,tipo_planeta.TERRESTRE,true);
        p1.imprimir();
        System.out.println("Densidad del planeta :" + p1.densidad());
        System.out.println("El planeta es exterior: " + p1.distancias());

        Planeta p2 = new Planeta("Júpiter",79,1.899E27,1.4313E15,139820,750000000,tipo_planeta.GASEOSO,true);
        p2.imprimir();
        System.out.println("Densidad del planeta :" + p2.densidad());
        System.out.println("El planeta es exterior: " + p2.distancias());
    }
}
