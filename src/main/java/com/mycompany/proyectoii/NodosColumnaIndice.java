/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoii;

/**
 *
 * @author victo
 */
//Se mueven en y
public class NodosColumnaIndice {

    private NodoY cabeza;
    private NodoY cola;

    public NodosColumnaIndice() {
        cabeza = cola = null;
    }
    
    // creamos un método para insertar un nodo al inicio de la lista horizontal
    public void insertarEnHorizontal(NodoY nodoHorizontal) {
        // si la cabeza está vacía, asignamos el nuevo nodo como cabeza y cola
        if (cabeza == null) {
            cabeza = cola = nodoHorizontal;
        } else {
            // si el valor del nuevo nodo es menor que el de la cabeza, lo colocamos al inicio
            if (nodoHorizontal.getX() < cabeza.getX()) {
                cabeza = insertarInicio(nodoHorizontal);
            } 
            // si el valor del nuevo nodo es mayor que el de la cola, lo colocamos al final
            else if (nodoHorizontal.getX() > cola.getX()) {
                cola = insertarFinal(nodoHorizontal);
            } 
            // si no, lo colocamos en medio
            else {
                insertarEnMedio(nodoHorizontal);
            }
        }
    }

    // creamos un método para colocar un nodo al inicio de la lista horizontal
    private NodoY insertarInicio(NodoY nodoHorizontal) {
        // establecemos los enlaces del nuevo nodo hacia la cabeza y viceversa
        nodoHorizontal.setDerecha(cabeza);
        if (cabeza != null) {
            cabeza.setIzquierda(nodoHorizontal);
        }
        // colocamos el nuevo nodo como cabeza de la lista
        cabeza = nodoHorizontal;
        return cabeza;
    }

    // creamos un método para colocar un nodo al final de la lista horizontal
    private NodoY insertarFinal(NodoY nodoHorizontal) {
        // si la cabeza está vacía, asignamos el nuevo nodo como cola
        if (cabeza == null) {
            return nodoHorizontal;
        }
        // si no está vacía, recorremos la lista hasta llegar al último nodo
        NodoY actual = cabeza;
        while (actual.getDerecha() != null) {
            actual = actual.getDerecha();
        }
        // establecemos los enlaces del último nodo hacia el nuevo nodo y viceversa
        actual.setDerecha(nodoHorizontal);
        nodoHorizontal.setIzquierda(actual);
        // colocamos el nuevo nodo como cola de la lista
        cola = nodoHorizontal;
        return cola;
    }

    // creamos un método para colocar un nodo en medio de la lista horizontal
    private NodoY insertarEnMedio(NodoY nodoHorizontal) {
        // buscamos el nodo después del cual se insertará el nuevo nodo
        NodoY actual = cabeza;
        while (actual != null && nodoHorizontal.getX() > actual.getX()) {
            actual = actual.getDerecha();
        }
        // si no se encuentra el nodo después del cual se insertará el nuevo nodo, no hacemos nada
        if (actual == null) {
            System.out.println("El valor después del cual se desea insertar no se encontró en la lista.");
            return cabeza;
        }
        // insertamos el nuevo nodo después del nodo actual
        NodoY anterior = actual.getIzquierda();
        nodoHorizontal.setDerecha(actual);
        nodoHorizontal.setIzquierda(anterior);
        actual.setIzquierda(nodoHorizontal);
        if (anterior != null) {
            anterior.setDerecha(nodoHorizontal);
        } else {
            cabeza = nodoHorizontal;
        }
        return cabeza;
    }

        public NodoY buscarEnColumnas(int x) {
        NodoY actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza
        while (actual != null) { // mientras no lleguemos al final de la lista
            if (actual.getX() == x) {
                System.out.println("Encontrado "+ actual.getX()); // imprimimos el valor del nodo actual
                return actual;
            }
            actual = actual.getDerecha(); // avanzamos al siguiente nodo
        }
        return null;
    }
        public boolean estaDisponibleEnX(int x) {
        boolean bandera = false;
        NodoY actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza
        while (actual != null) { // mientras no lleguemos al final de la lista
            if (actual.getX() == x) {
                //System.out.println("Encontrado " + actual.getY()); // imprimimos el valor del nodo actual
                bandera = true;
                return bandera;
            }
            actual = actual.getDerecha(); // avanzamos al siguiente nodo
        }
        return bandera;
    }
        
        
    // creamos un método para mostrar los nodos de la lista horizontal
    public void mostrarLista() {
        NodoY actual = cabeza;
        System.out.print("|" + "i" + "|"); // imprimimos el valor del nodo actual
        while (actual != null) {
            System.out.print("|" + actual.getX() + "|"); // imprimimos el valor del nodo actual
            actual = actual.getDerecha(); // avanzamos al siguiente nodo
        }
        System.out.println(); // agregamos "null" al final de la lista
    }
}
