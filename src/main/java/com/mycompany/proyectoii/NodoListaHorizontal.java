/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoii;

/**
 *
 * @author victo
 */
//se mueven en horizontal
public class NodoListaHorizontal {

    private NodoOrtogonal cabeza;
    private NodoOrtogonal cola;

    //utilizamos listas doblemente enlazadas por lo cual deben apuntar a nulo
    public NodoListaHorizontal() {
        this.cabeza = this.cola = null;
    }

    public void insertarEnHorizontal(NodoOrtogonal nodoHorizontal) {
        //si la cabeza esta vacia entonces podemos asignar un nuevo elemento
        if (cabeza == null) {
            this.cabeza = this.cola = nodoHorizontal;
            //cocmo vamos aumentando segun se van ingresando al principio estaran los menores y de ultimo los mayores
        } else {
            if (nodoHorizontal.getX() < cabeza.getX()) {
//si es mayor que el final va de ultimo osea es nuevo
                cabeza = insertarInicio(nodoHorizontal);
            } else if (nodoHorizontal.getX() > cola.getX()) {
                //si no es ni mayor ni menor entonces va en medioo
                cola = insertarFinal(nodoHorizontal);

            } else {
                insertarEnMedio(nodoHorizontal);
            }

        }

    }

//aqui los valores se van empujando de izquierda a derecha hasta llegar a null
    // 1 <- 2 <- null
    private NodoOrtogonal insertarInicio(NodoOrtogonal nodoHorizontal) {
        // establecemos los enlaces del nuevo nodo hacia la cabeza y viceversa
        nodoHorizontal.setDerecha(cabeza);
        if (cabeza != null) {
            cabeza.setIzquierda(nodoHorizontal);
        }
        // colocamos el nuevo nodo como cabeza de la lista
        cabeza = nodoHorizontal;
        return cabeza;
    }

//aqui los valores se van empujando de derecha a izquierda inicando con null
    // nuull -> 2 -> 1 
    private NodoOrtogonal insertarFinal(NodoOrtogonal nodoHorizontal) {
        // si la cabeza está vacía, asignamos el nuevo nodo como cola
        if (cabeza == null) {
            return nodoHorizontal;
        }
        // si no está vacía, recorremos la lista hasta llegar al último nodo
        NodoOrtogonal actual = cabeza;
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

    private NodoOrtogonal insertarEnMedio(NodoOrtogonal nodoHorizontal) {
        // buscamos el nodo después del cual se insertará el nuevo nodo
        NodoOrtogonal actual = cabeza;
        while (actual != null && nodoHorizontal.getX() > actual.getX()) {
            actual = actual.getDerecha();
        }
        // si no se encuentra el nodo después del cual se insertará el nuevo nodo, no hacemos nada
        if (actual == null) {
            System.out.println("El valor después del cual se desea insertar no se encontró en la lista.");
            return cabeza;
        }
        // insertamos el nuevo nodo después del nodo actual
        NodoOrtogonal anterior = actual.getIzquierda();
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

    public void mostrarLista() {
        NodoOrtogonal actual = cabeza;
        while (actual != null) {
            System.out.print("|" + actual.getX() + "|"); // Imprime el valor del nodo actual
            actual = actual.getDerecha(); // Avanza al siguiente nodo
        }
        System.out.println(); // agregamos "null" al final de la lista

//System.out.println("null"); // Agrega "null" al final de la lista
    }
}
