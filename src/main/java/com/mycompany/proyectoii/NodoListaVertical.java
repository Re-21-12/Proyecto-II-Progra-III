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
public class NodoListaVertical {

    private NodoOrtogonal cabeza;
    private NodoOrtogonal cola;

    //utilizamos listas doblemente enlazadas por lo cual deben apuntar a nulo
    public NodoListaVertical() {
        this.cabeza = this.cola = null;
    }

    public void insertarEnVertical(NodoOrtogonal nodoVertical) {
        //si la cabeza esta vacia entonces podemos asignar un nuevo elemento
        if (cabeza == null) {
            this.cabeza = this.cola = nodoVertical;
            //cocmo vamos aumentando segun se van ingresando al principio estaran los menores y de ultimo los mayores
        } else {
            if (nodoVertical.getY() < cabeza.getY()) {
//si es mayor que el final va de ultimo osea es nuevo
                cabeza = insertarInicio(nodoVertical);
            } else if (nodoVertical.getY() > cola.getY()) {
                //si no es ni mayor ni menor entonces va en medioo
                cola = insertarFinal(nodoVertical);
            } else {
                insertarEnMedio(nodoVertical);
            }

        }

    }

//aqui los valores se van empujando de izquierda a derecha hasta llegar a null
    // 1 <- 2 <- null
    private NodoOrtogonal insertarInicio(NodoOrtogonal nodoVertical) {
        NodoOrtogonal nuevoNodo = nodoVertical;
        // si es 3 -> null
        nuevoNodo.setAbajo(cabeza);
        //si no es nulo enetonces agregalo a la izqierda 3-> 5 -> null
        if (cabeza != null ) {
            cabeza.setArriba(nuevoNodo);
        }
         cabeza = nuevoNodo; // el nuevo nodo se convierte en la cabeza
        return cabeza;
    }
//aqui los valores se van empujando de derecha a izquierda inicando con null

    // nuull -> 2 -> 1 
     private NodoOrtogonal insertarFinal(NodoOrtogonal nodoVertical) {
        NodoOrtogonal nuevoNodo = nodoVertical; // creamos un nuevo nodo
        if (cabeza == null) { // si la cabeza es nula
            return nuevoNodo; // retornamos el nuevo nodo
        }
        NodoOrtogonal actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza
        while (actual.getAbajo() != null) { // mientras no lleguemos al final de la lista
            actual = actual.getAbajo(); // avanzamos al siguiente nodo
        }
        actual.setAbajo(nuevoNodo); // establecemos el nuevo nodo como el siguiente del último
        nuevoNodo.setArriba(actual); // el nodo anterior al nuevo nodo será el último
        cola = nuevoNodo; // el nuevo nodo se convierte en la cola
        return cola; // retornamos la cabeza
    }

    private NodoOrtogonal insertarEnMedio(NodoOrtogonal nodoVertical) {
        NodoOrtogonal actual = cabeza; // creamos un nodo auxiliar y lo inicializamos con la cabeza

        while (actual != null && nodoVertical.getY() > actual.getY()) { // mientras no lleguemos al final y la posición del nodo actual sea menor que la del nuevo nodo
            actual = actual.getAbajo(); // avanzamos al siguiente nodo
        }

        if (actual == null) { // si llegamos al final de la lista
            System.out.println("El valor después del cual se desea insertar no se encontró en la lista."); // mostramos un mensaje de error
            return cabeza; // retornamos la cabeza
        }

        NodoOrtogonal anterior = actual.getArriba();
        nodoVertical.setAbajo(actual); // el nodo siguiente al nuevo nodo será el siguiente del nodo actual
        nodoVertical.setArriba(anterior); // el nodo anterior al nuevo nodo será el nodo actual
        actual.setArriba(nodoVertical); // el nodo actual apuntará abajo al nuevo nodo
        if (anterior != null) {
            anterior.setAbajo(nodoVertical);
        } else {
            cabeza = nodoVertical;
        }

        return cabeza; // retornamos la cabeza
    }

    public void mostrarLista() {
        NodoOrtogonal actual = cabeza;
        //System.out.println("|" + "i" + "|"); // Imprime el valor del nodo actual
        while (actual != null) {
            System.out.println("|" + actual.getY() + "|"); // Imprime el valor del nodo actual
            actual = actual.getAbajo(); // Avanza al siguiente nodo
        }
        //System.out.println("null"); // Agrega "null" al final de la lista
    }
    
        
    
}
