package Practica;

public class Trabajador {

    //atrubutos 
    String nombre;
    int horas;
    float tarifa;

    int extra;
    int excede;

    public Trabajador(String nombre, int horas, float tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public Trabajador() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public float hallarSueldo() {
        int hora = 0;
        if (horas > 40) {
            extra = horas - 40;
            hora = 40;
        }

        if (extra > 8) {
            excede = extra - 8;
            extra = 8;
        }

        float pago = hora * tarifa + extra * (tarifa * 2) + excede * (tarifa * 3);
        return pago;
    }

    public void mostrarDatos() {
        float pago = hallarSueldo();
        System.out.println("Nombre : " + nombre);
        System.out.println("Horas trabajadas : " + horas);
        System.out.println("Tarifa por hora : " + tarifa);
        System.out.println("Horas extras : " + extra);
        System.out.println("Horas extras en Exceso : " + excede);
        System.out.println("Sueldo : s/" + pago);
        System.out.println("");
    }
}
