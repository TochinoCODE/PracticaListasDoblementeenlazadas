/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Principal {

    static Scanner entrada = new Scanner(System.in);
    static ListaDoblementeEnlazadaPractica lista = new ListaDoblementeEnlazadaPractica();

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int opcion;

        do {
            System.out.println("\n\tMenú de Opciones");
            System.out.println("==================================");
            System.out.println("[1] Insertar Trabajador");
            System.out.println("[2] Eliminar trabajador");
            System.out.println("[3] Buscar Nombre Del Trabajador");
            System.out.println("[4] Modificar nombre");
            System.out.println("[5] Mostrar lista");
            System.out.println("===================================");
            System.out.println("[6] Salir de la Aplicación");

            System.out.print("Ingrese una Opción : ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    ingreso(pedirDatos());
                    break;
                case 2:
                    lista.eliminarInicio();
                    break;
                case 3:
                    if (lista.buscarNombre(pedirNombre())); else {
                        System.out.println("Ingrese el nombre completo");
                    }
                    break;
                case 4:
                    if (lista.modificarNombre(pedirNombre(), pedirNewNombre())); else {
                        System.out.println("Ingrese el nombre completo");
                    }
                    break;
                case 5:
                    lista.recorrido();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese opcion valida ");
            }

        } while (opcion != 0);
    }

    static void ingreso(Trabajador valor) {
        lista.ingresarInicio(valor);
    }

    static Trabajador pedirDatos() {
        System.out.print("Ingrese su nombre : ");
        entrada.nextLine();
        String nombre = entrada.nextLine();
        System.out.print("Ingrese Horas trabajadas : ");
        int hora = entrada.nextInt();
        System.out.print("Ingrese Tarifa por Horas  : ");
        float tarifa = entrada.nextFloat();

        Trabajador persona = new Trabajador(nombre, hora, tarifa);
        return persona;
    }

    static String pedirNombre() {
        System.out.print("Ingrese nombre a buscar: ");
        entrada.nextLine();
        String nom = entrada.nextLine();
        return nom;
    }

    static String pedirNewNombre() {
        System.out.print("Ingrese nuevo nombre del empleado : ");
        String nom = entrada.nextLine();
        return nom;
    }
}
