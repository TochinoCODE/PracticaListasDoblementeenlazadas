package Practica;

public class Nodo {

    //Atributos de un nodo
    private Trabajador datos;
    private Nodo siguiente;
    private Nodo anterior;

    public Trabajador getDatos() {
        return datos;
    }

    public void setDatos(Trabajador datos) {
        this.datos = datos;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public void listar() {
        datos.mostrarDatos();
    }

    public String nombreTrajador() {
        return datos.getNombre();
    }

    public void editarNombre(String newNombre) {
        datos.setNombre(newNombre);
        System.out.println("Se modifico el nombre...");
    }

}
