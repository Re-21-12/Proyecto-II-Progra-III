/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectoii;

import java.util.Scanner;
import java.util.Stack;
import java.util.Random;

/**
 *
 * @author victo
 */
public class ProyectoII {

    public static void main(String[] args) {
        MatrizOrtogonal matrizDinamica = new MatrizOrtogonal();

        matrizDinamica.mostrarMatriz();

        Scanner entrada = new Scanner(System.in);
        //indicar seleccion
        Integer opcion;
        String continuar;
        //Nodo raiz = new Nodo();   
        System.out.println("Bienvenido a Proyecto 2!");

        do {
            System.out.println("Seleccione una opcion: ");
            System.out.println("[1]\t Ingresar nuevo carro");
            System.out.println("[2]\t Buscar un carro");
            System.out.println("[3]\t Eliminar un carro");
            System.out.println("[0]\t Salir");
            opcion = entrada.nextInt();
            continuar = "";
            switch (opcion) {
                case 1:
                    entrada.nextLine();
                    System.out.println("Ingrese un carro nuevo:");
                    do {
                        Random random = new Random();
                        int x = random.nextInt(1000);
                        int y = random.nextInt(1000);
                        Vehiculo carro = ingresarDatosCarro();
                        matrizDinamica.insertarEnMatriz(x, y, carro);
                        matrizDinamica.mostrarMatriz();
                        System.out.println("Desea ingresar otro carro [s/n]");
                        continuar = entrada.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));
                    break;
                case 2:
                    entrada.nextLine();
                    System.out.println("Bienvenido a busqueda de carro por propiedad");
                    do {
                        buscarDatosCarro(matrizDinamica);
                        System.out.println("Desea buscar otro carro [s/n]");
                        continuar = entrada.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));

                    break;
                case 3:
                    entrada.nextLine();
                    System.out.println("Bienvenido a eliminar carro por propiedad");
                    do {
                        eliminarDatosCarroEnMatriz(matrizDinamica);
                        System.out.println("Desea buscar otro carro [s/n]");
                        continuar = entrada.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));

                    break;
            }
        } while (opcion != 0);
    }

    public static Vehiculo ingresarDatosCarro() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una placa para el vehiculo");
        String placa = entrada.nextLine();
        System.out.println("Ingrese un color para el vehiculo");
        String color = entrada.nextLine();
        System.out.println("Ingrese una linea para el vehiculo");
        String linea = entrada.nextLine();
        System.out.println("Ingrese el nombre del propietario para el vehiculo");
        String propietario = entrada.nextLine();
        System.out.println("Ingrese un  modelo para el vehiculo");
        String modelo = entrada.nextLine();
        Vehiculo carro = new Vehiculo(placa, color, linea, modelo, propietario);
        return carro;
    }

    public static void buscarDatosCarro(MatrizOrtogonal matrizDinamica) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Seleccione una opcion para buscar");
        System.out.println("[1] Busqueda por placa");
        System.out.println("[2] Busqueda por color");
        System.out.println("[3] Busqueda por linea");
        System.out.println("[4] Busqueda por modelo");
        System.out.println("[5] Busqueda por nombre del propietario");
        switch (opcion) {
            case 1:
                System.out.println("Ingrese una placa para buscar el vehiculo");
                String placa = entrada.nextLine();
                matrizDinamica.buscarEnMatrizPorCarro(placa, "", "", "", "");
                break;
            case 2:
                System.out.println("Ingrese un color para buscar el vehiculo");
                String color = entrada.nextLine();
                matrizDinamica.buscarEnMatrizPorCarro("", color, "", "", "");
                break;
            case 3:
                System.out.println("Ingrese una linea para buscar el vehiculo");
                String linea = entrada.nextLine();
                matrizDinamica.buscarEnMatrizPorCarro("", "", linea, "", "");
                break;
            case 4:
                System.out.println("Ingrese un  modelo para el vehiculo");
                String modelo = entrada.nextLine();
                matrizDinamica.buscarEnMatrizPorCarro("", "", "", "", modelo);
                break;
            case 5:
                System.out.println("Ingrese el nombre del propietario para buscar el vehiculo");
                String propietario = entrada.nextLine();
                matrizDinamica.buscarEnMatrizPorCarro("", "", "", propietario, "");
                break;
        }
    }

    public static void eliminarDatosCarroEnMatriz(MatrizOrtogonal matrizDinamica) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Seleccione una opcion para buscar");
        System.out.println("[1] Eliminar por placa");
        System.out.println("[2] Eliminar por color");
        System.out.println("[3] Eliminar por linea");
        System.out.println("[4] Eliminar por modelo");
        System.out.println("[5] Eliminar por nombre del propietario");
        switch (opcion) {
            case 1:
                System.out.println("Ingrese una placa para buscar el vehiculo");
                String placa = entrada.nextLine();
                matrizDinamica.eliminarEnMatrizPorPropiedad(placa, "", "", "", "");
                break;
            case 2:
                System.out.println("Ingrese un color para buscar el vehiculo");
                String color = entrada.nextLine();
                matrizDinamica.eliminarEnMatrizPorPropiedad("", color, "", "", "");
                break;
            case 3:
                System.out.println("Ingrese una linea para buscar el vehiculo");
                String linea = entrada.nextLine();
                matrizDinamica.eliminarEnMatrizPorPropiedad("", "", linea, "", "");
                break;
            case 4:
                System.out.println("Ingrese un  modelo para el vehiculo");
                String modelo = entrada.nextLine();
                matrizDinamica.eliminarEnMatrizPorPropiedad("", "", "", "", modelo);
                break;
            case 5:
                System.out.println("Ingrese el nombre del propietario para buscar el vehiculo");
                String propietario = entrada.nextLine();
                matrizDinamica.eliminarEnMatrizPorPropiedad("", "", "", propietario, "");
                break;
        }
    }

}
