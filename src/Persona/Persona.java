package Persona;

public class Persona {
    String nombre;
    String apellido;
    String n_identidad;
    String nacimiento;
    String pais_nacimiento;
    char genero;

    Persona(String nombre, String apellido, String n_identidad, String nacimiento, String pais_nacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.n_identidad = n_identidad;
        this.nacimiento = nacimiento;
        this.pais_nacimiento = pais_nacimiento;
        this.genero = genero;
    }

    void imprimirValores() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellido);
        System.out.println("Documento de identidad: " + this.n_identidad);
        System.out.println("Fecha de nacimiento:" + this.nacimiento);
        System.out.println("Pais de nacimiento: " + this.pais_nacimiento);
        System.out.println("Genero: " + this.genero);
        System.out.println("");
    }

    public static void main(String args[]) {
        Persona p1 = new Persona("Sebastian","Velasquez Grajales", "1034918712", "06/03/2006", "Colombia", 'H');
        Persona p2 = new Persona("Sebastian","Velasquez Grajales", "1034918712", "06/03/2006", "Colombia", 'H');

        p1.imprimirValores();
        p2.imprimirValores();
    }


}
