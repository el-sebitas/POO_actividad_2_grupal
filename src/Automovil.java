public class Automovil {
    String marca;
    int modelo;
    int motor;
    enum tipo_combustible {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL}
    tipo_combustible tipo_c;
    enum tipo_automovil {CARRO_CIUDAD, SUBCOMPACTO, FAMILIAR, EJECUTIVO, SUV}
    tipo_automovil tipo_a;
    int n_puertas;
    int n_asientos;
    int vel_max;
    enum colores {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
    colores color;
    int vel_actual;
    enum caja_cambios {MANUAL, AUTOMATICA}
    caja_cambios caja;
    int multas;

    public Automovil(String marca, int modelo, int motor, tipo_combustible tipo_c, tipo_automovil tipo_a, int n_puertas, int n_asientos, int vel_max, colores color, caja_cambios caja) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipo_c = tipo_c;
        this.tipo_a = tipo_a;
        this.n_puertas = n_puertas;
        this.n_asientos = n_asientos;
        this.vel_max = vel_max;
        this.color = color;
        this.caja = caja;
        this.vel_actual = 0;
        this.multas = 0;
    }

    void acelerar(int incremento_vel) {
        int vel = getVel_actual() + incremento_vel;
        if (vel <= getVel_max() && vel > 0) {
            setVel_actual(vel);
        } else if (getVel_actual() + incremento_vel > 0) {
            System.out.println("Recibiste una multa");
            setMultas(getMultas() + 1);
        }
    }

    void desacelerar(int descenso_vel) {
        if (getVel_actual() - descenso_vel >= 0) {
            setVel_actual(getVel_actual() - descenso_vel);
        } else {
            System.out.println("No se puede disminuir la velocidad por debajo de 0");
        }
    }

    void frenar() {
        setVel_actual(0);
    }

    void tiempoLlegada(double distancia) {
        double tiempo = distancia / getVel_actual();
        System.out.println("El tiempo de llegada estimado es de: " + (int) (tiempo * 100) + " minutos");
    }

    void mostrarValores() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Motor: " + getMotor());
        System.out.println("Tipo de combustible: " + getTipo_c());
        System.out.println("Tipo de automovil: " + getTipo_a());
        System.out.println("Numero de puertas: " + getN_puertas());
        System.out.println("Numero de asientos: " + getN_asientos());
        System.out.println("Velocidad maxima: " + getVel_max());
        System.out.println("Color: " + getColor());
        System.out.println("Velocidad actual: " + getVel_actual());
        System.out.println("Tipo de caja de cambios: " + getCaja());
        System.out.println(" ");
    }

    void verificarMultas() {
        if (getMultas() > 0) {
            System.out.println("El vehiculo tiene " + getMultas() + " multas");
        } else {
            System.out.println("El vehiculo no tiene multas");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipo_combustible getTipo_c() {
        return tipo_c;
    }

    public void setTipo_c(tipo_combustible tipo_c) {
        this.tipo_c = tipo_c;
    }

    public tipo_automovil getTipo_a() {
        return tipo_a;
    }

    public void setTipo_a(tipo_automovil tipo_a) {
        this.tipo_a = tipo_a;
    }

    public int getN_puertas() {
        return n_puertas;
    }

    public void setN_puertas(int n_puertas) {
        this.n_puertas = n_puertas;
    }

    public int getN_asientos() {
        return n_asientos;
    }

    public void setN_asientos(int n_asientos) {
        this.n_asientos = n_asientos;
    }

    public int getVel_max() {
        return vel_max;
    }

    public void setVel_max(int vel_max) {
        this.vel_max = vel_max;
    }

    public colores getColor() {
        return color;
    }

    public void setColor(colores color) {
        this.color = color;
    }

    public int getVel_actual() {
        return vel_actual;
    }

    public void setVel_actual(int vel_actual) {
        this.vel_actual = vel_actual;
    }

    public caja_cambios getCaja() {
        return caja;
    }

    public void setCaja(caja_cambios caja) {
        this.caja = caja;
    }

    public int getMultas() {
        return multas;
    }

    public void setMultas(int multas) {
        this.multas = multas;
    }

    public static void main(String args[]) {
        Automovil auto1 = new Automovil("Ford",2018, 3, tipo_combustible.DIESEL, tipo_automovil.EJECUTIVO, 5, 6, 250, colores.NEGRO, caja_cambios.MANUAL);
        auto1.mostrarValores();
        auto1.setVel_actual(100);
        System.out.println("Velocidad actual: " + auto1.getVel_actual());
        auto1.acelerar(20);
        auto1.tiempoLlegada(100);
        System.out.println("Velocidad actual: " + auto1.getVel_actual());
        auto1.desacelerar(50);
        System.out.println("Velocidad actual: " + auto1.getVel_actual());
        auto1.frenar();
        System.out.println("Velocidad actual: " + auto1.getVel_actual());
        auto1.desacelerar(20);

    }
}
