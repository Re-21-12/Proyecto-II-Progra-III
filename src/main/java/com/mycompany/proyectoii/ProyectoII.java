/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyectoii;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author victo
 */
public class ProyectoII {

    public static void main(String[] args) {
        MatrizOrtogonal matrizDinamica = new MatrizOrtogonal();
        Vehiculo cocheFamiliar = new Vehiculo("ABC123", "Azul", "Sedan", "2020", "Juan Pérez");
        matrizDinamica.insertarEnMatriz(3, 5, cocheFamiliar);
        /*        
        NodoListaVertical listaVertical = new NodoListaVertical();
        NodoListaHorizontal listaHorizontal = new NodoListaHorizontal();

        NodosFilasIndice filas = new NodosFilasIndice();
        NodosColumnaIndice columnas = new NodosColumnaIndice();
        
        Vehiculo cocheFamiliar = new Vehiculo("ABC123", "Azul", "Sedan", "2020", "Juan Pérez");
        Vehiculo cochesdfsd = new Vehiculo("XBA123", "Azul", "Sedan", "2020", "Juan Pérez");

        listaVertical.insertarEnVertical(new NodoOrtogonal(cocheFamiliar, 1, 0));
        listaVertical.insertarEnVertical(new NodoOrtogonal(cochesdfsd, 1, 1));

        listaHorizontal.insertarEnHorizontal(new NodoOrtogonal(cocheFamiliar, 1, 1));
        listaHorizontal.insertarEnHorizontal(new NodoOrtogonal(cochesdfsd, 2, 1));

        filas.insertarEnVertical(new NodoX(1));
        filas.insertarEnVertical(new NodoX(6));
        filas.insertarEnVertical(new NodoX(5));

        columnas.insertarEnHorizontal(new NodoY(1));
        columnas.insertarEnHorizontal(new NodoY(6));
        columnas.insertarEnHorizontal(new NodoY(5));

        columnas.mostrarLista();

        //filas.buscarEnFilas(5);
        filas.mostrarLista();

        //listaVertical.mostrarLista();
        //listaHorizontal.mostrarLista();
         */
 /*
          Scanner entrada = new Scanner(System.in);
        NodoOrtogonal i;
        //indicar seleccion
        Integer opcion;
        //Nodo raiz = new Nodo();   
        System.out.println("Bienvenido a Proyecto 2!");

        do {
            System.out.println("Seleccione una opcion: ");
            System.out.println("[1]\t Ingresar nuevo dato");
            System.out.println("[2]\t Buscar un dato");
            System.out.println("[3]\t Eliminar");
            System.out.println("[0]\t Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    entrada.nextLine();
                    System.out.println("Ingrese una expresion:");
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        } while (opcion != 0);
         */
    }
}
