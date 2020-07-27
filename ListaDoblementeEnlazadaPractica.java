package Practica;

public class ListaDoblementeEnlazadaPractica {

    private Nodo cabeza;
    private Nodo cola;
    private int tamaño;

    public ListaDoblementeEnlazadaPractica() {
        cabeza = null;
        cola = null;
        tamaño = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    //ingresar al inicio
    public void ingresarInicio(Trabajador valor) {
        Nodo nuevo = new Nodo();
        nuevo.setDatos(valor);
        if (estaVacia()) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }
        tamaño++;
    }

    public void recorrido() {
        int contador = 0;
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo temp = cabeza;
            while (contador < tamaño) {
                temp.listar();
                temp = temp.getSiguiente();
                contador++;
            }
        }
    }

    public void eliminarInicio() {
        if (estaVacia()) {
            System.out.println("**Lista vacia**");
        } else {
            cabeza = cabeza.getSiguiente();
            tamaño--;
            System.out.println("Eliminado...");
        }

    }

    public boolean buscarNombre(String nombre) {
        int contador = 0;
        Nodo temp = cabeza;
        if (estaVacia()) {
            System.out.println("**Lista vacia**");
        } else {
            while (contador < tamaño) {
                if (temp.nombreTrajador().equals(nombre)) {
                    System.out.println("Buscando ....");
                    System.out.println("Resultados");
                    temp.listar();
                    return true;
                }
                temp = temp.getSiguiente();
                contador++;
            }
        }
        return false;
    }

    public boolean modificarNombre(String nombre, String newNombre) {
        int contador = 0;
        Nodo temp = cabeza;
        if (estaVacia()) {
            System.out.println("**Lista vacia**");
        } else {
            while (contador < tamaño) {
                if (temp.nombreTrajador().equals(nombre)) {
                    temp.editarNombre(newNombre);
                    return true;
                }
                temp = temp.getSiguiente();
                contador++;
            }
        }
        return false;
    }

}
