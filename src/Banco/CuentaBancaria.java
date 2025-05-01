package Banco;

public class CuentaBancaria {
    String nombre;
    String apellidos;
    int numero_cuenta;
    enum tipo_cuenta {AHORROS, CORRIENTE} tipo_cuenta tipo;
    double saldo;
    double tasa_interes;

    public CuentaBancaria(String apellidos, String nombre, int numero_cuenta, tipo_cuenta tipo) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.numero_cuenta = numero_cuenta;
        this.tipo = tipo;
        this.saldo = 0;
        this.tasa_interes = 0;
    }

    void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Numero de cuenta: " + numero_cuenta);
        System.out.println("Tipo de cuenta: " + tipo);
        System.out.println("Saldo: $" + saldo);
    }

    void imprimirSaldo() {
        System.out.println("Su saldo es: $" + saldo);
    }

    void consignar(double saldo) {
        if (saldo >= 0) {
            System.out.println("Se ha consignado con exito");
            this.saldo += saldo;
            imprimirSaldo();
        } else {
            System.out.println("El valor ingresado no es valido");
        }
    }

    boolean retirar(double saldo) {
        if (saldo > this.saldo || saldo < 0) {
            System.out.println("El valor solicitado no se puede retirar de la cuenta");
            return false;
        } else {
            this.saldo -= saldo;
            System.out.println("Se ha retirado con exito");
            imprimirSaldo();
            return true;
        }
    }

    boolean compararCuenta(CuentaBancaria cuenta) {
        return this.saldo >= cuenta.saldo;
    }

    void transferir(CuentaBancaria cuenta, double valor) {
        if (retirar(valor)) {
            cuenta.consignar(valor);
            System.out.println("Se ha transferido con exito");
            imprimirDatos();
        } else {
            System.out.println("No se pudo transferir el dinero");
        }
    }

    void aplicarTasa() {
        this.saldo += this.saldo * this.tasa_interes;
    }

    public static void main(String args[]) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Pedro","Pérez",123456789,tipo_cuenta.AHORROS);
        cuenta1.imprimirDatos();
        cuenta1.consignar(200000);

        CuentaBancaria cuenta2 = new CuentaBancaria("Pablo","Pinzón",44556677,tipo_cuenta.AHORROS);
        cuenta2.consignar(100000);

        if (cuenta1.compararCuenta(cuenta2)) {
            System.out.println("La cuenta de " + cuenta1.nombre + " es mayor");
        } else {
            System.out.println("La cuenta de " + cuenta1.nombre + " es menor");
        }

        cuenta1.transferir(cuenta2, 50000);
    }
}
